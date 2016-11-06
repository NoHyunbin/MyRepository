package com.riotgames.test.dao;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

import org.springframework.stereotype.Component;

@Component
public class CalculateDao {
	public static final double PI = Math.PI;
	public static final double E = Math.E;

	public String calc(String exp) {
		Stack<String> stack = new Stack<>();
		List<String> list = new ArrayList<>();
		try {
			return postfix(exp, stack, list);
		} catch (Exception e){
			return "ERROR";
		}
	}
	
	// DAO의 메소드. 수식을 postfix로 수정
	public static String postfix(String exp, Stack<String> stack, List<String> list) {
		StringTokenizer st = new StringTokenizer(exp, "+*-/()^ ", true);
		String beforeToken = "1";
		while ( st.hasMoreTokens() ) {
			String token = st.nextToken();
			if ( token.equals(" ") ) continue;
			token = token.trim();
			
			if ( token.equals("e") ) {
				token = String.valueOf(E);
			}
			if ( token.equals("pi") ) {
				token = String.valueOf(PI);
			}
			
			if ( token.equals("-") ) {
				if ( beforeToken.equals("-") ) {
					stack.pop();
					stack.push("+");
					continue;
				} else if ( isOperator(beforeToken) ) {
					beforeToken = token;
					token = token + st.nextToken();
				} 
			}
			
			if ( list.isEmpty() && token.equals("-") ) list.add("0");
			
			if ( !isOperator(token) ) {
				if ( token.equals("(") ) {
					stack.add(token);
				} else if ( token.equals(")") ) {
					String tmp = "";
					while ( !(tmp = stack.pop()).equals("(") ) {
						list.add(tmp);
					}
				} else
					list.add(token);
			} else {
				if ( stack.isEmpty() || !isOperator(stack.peek()) )
					stack.push(token);
				else {
					if ( getPriority(stack.peek()) < getPriority(token) ) {
						stack.push(token);
					} else {
						if ( token.equals("^") && stack.peek().equals("^") ) {
							stack.push(token);
						} else {
							while( true ) {
								if ( getPriority(stack.peek()) >= getPriority(token) ) {
									list.add(stack.pop());
								} else {
									stack.push(token);
									break;
								}
								if ( stack.isEmpty() ) {
									stack.push(token);
									break;
								}
							}
						}
					}
				}
			}
			beforeToken = token;
		}

		while (!stack.isEmpty()) {
			list.add(stack.pop());
		}
		return calcPostfix(list);
	}
	
	// postfix로 변환된 수식을 계산
	public static String calcPostfix(List<String> list) {
		Stack<String> stack = new Stack<>();

		for (int i = 0; i < list.size(); i++) {
			String token = list.get(i);

			if ( !isOperator(token) ) {
				stack.push(token);
			} else {
				if ( getPriority(stack.get(stack.size() - 1)) < getPriority(token) ) {
					stack.push(token);
				} else {
					double afterOperand = Double.parseDouble(stack.pop());
					double beforeOperand = Double.parseDouble(stack.pop());
					double tmp = calc(beforeOperand, afterOperand, token);
					stack.push(tmp+"");
				}
			}
		}
		
		DecimalFormat df = new DecimalFormat("0.000000");
		if ( stack.peek().equals("Infinity") ) {
			return "ERROR";
		} else if ( stack.peek().equals("-0.0") ) {
			return "0.000000";
		} else {
			return df.format( Double.parseDouble(stack.pop()) );			
		}
		
	}

	public static double calc(double beforeOperand, double afterOperand, String operator) {
		double result = 0;
		if ( operator.equals("+") ) {
			result = beforeOperand + afterOperand;
		} else if ( operator.equals("-") ) {
			result = beforeOperand - afterOperand;
		} else if ( operator.equals("*") ) {
			result = beforeOperand * afterOperand;
		} else if ( operator.equals("/") ) {
			result = beforeOperand / afterOperand;
		} else if ( operator.equals("^") ) {
			result = Math.pow(beforeOperand, afterOperand);
		}

		return result;
	}

	public static int getPriority(String operator) {
		if ( operator.equals("+") || operator.equals("-") ) {
			return 1;
		} else if ( operator.equals("*") || operator.equals("/") ) {
			return 2;
		} else if ( operator.equals("^") ) {
			return 3;
		} else {
			return 4;
		}
			
	}

	public static boolean isOperator(String str) {
		if ( str.equals("^") || str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/") )
			return true;
		else
			return false;
	}
}
