package myExercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class Postfix {
	public static final double PI = 3.141593;
	public static final double E = 2.718282; 
	static Stack<String> stack = new Stack<>();
	static List<String> postfix = new ArrayList<>();
	
	public static void main(String[] args) throws IOException {
		Reader reader = new FileReader("src/myExercise/riot_test_case.txt");
		BufferedReader br = new BufferedReader(reader);
		String exp = " ";
		int i = 0;
		while ( exp != null ) {
			exp = br.readLine();
			if ( i == 33 ) break;
			i++;
			
			System.out.print(i + ". " + exp + " = ");
			
			try {
				postfix(exp);
				System.out.println();
			} catch (Exception e){
//				e.printStackTrace();
				System.out.println("ERROR");
				System.out.println();
			} finally {
				stack.clear();
				postfix.clear();
			}
		}

	}

	public static void postfix(String exp) {
		StringTokenizer st = new StringTokenizer(exp, "+*-/()^ ", true);
		int i = 0;
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
			
			if ( postfix.isEmpty() && token.equals("-") ) postfix.add("0");
//			System.out.println(token);
			
			if ( !isOperator(token) ) {
				if ( token.equals("(") ) {
					stack.add(token);
				} else if ( token.equals(")") ) {
					String tmp = "";
					while ( !(tmp = stack.pop()).equals("(") ) {
						postfix.add(tmp);
					}
				} else
					postfix.add(token);
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
									postfix.add(stack.pop());
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
			postfix.add(stack.pop());
		}
		calcPostfix();
	}

	public static void calcPostfix() {
		stack.clear();

		for (int i = 0; i < postfix.size(); i++) {
			String token = postfix.get(i);

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
			System.out.println("ERROR");
		} else if ( stack.peek().equals("-0.0") ) {
			System.out.println("0.000000");
		} else {
			System.out.println( df.format( Double.parseDouble( stack.pop() ) ) );			
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