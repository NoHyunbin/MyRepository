package myExercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RiotTest {
	public final static double PI = 3.141593;
	public final static double E = 2.718282;
	public int index = 0;

	public static void main(String[] args) throws IOException {
		Reader reader = new FileReader("src/myExercise/riot_test_case.txt");
		BufferedReader br = new BufferedReader(reader);
		
		// for문 처음 34번 돌리기
		for ( int g = 1 ; g < 33 ; g++ ) {
		String result = "";
		Scanner scanner = new Scanner(System.in);
//		String expressions = "((2+3)*(4-5))/-1";
//		String expressions = "(1+1)";
		String expressions = br.readLine();
		DecimalFormat df = new DecimalFormat("0.000000");
		DecimalFormat df2 = new DecimalFormat("00");
		List<String> list = new ArrayList<>();
		
		char[] expressionsArray = expressions.toCharArray();
//		System.out.println(expressionsArray);
		System.out.println(df2.format(g) + " " + expressions);
		
		int leftCount = 0;
		int rightCount = 0;

		// 배열 전체 내용 확인
		for ( int i = 0 ; i < expressionsArray.length ; i++ ) {
//			System.out.println(i);
			// 괄호 객수 확인
//			if ( expressionsArray[i] == '(' ) leftCount++;
//			if ( expressionsArray[i] == ')' ) rightCount++;
			
			// 공백 확인
			if ( expressionsArray[i] == ' ' ) continue;
			
			// -가 음수인지, 빼기인지 확인
			if ( expressionsArray[i] == '-' ) {
				if( expressionsArray[i+1] == '-') {
					list.add("+");
					i++;
					continue;
				} else if ( i == 0 ) {
					String minusNum = "-";
					for ( int x = i+1 ; ; x++ ){
						if ( isNum(expressionsArray[x]) ) {
							minusNum += expressionsArray[x];
							i++;
						} else {
							list.add(minusNum);
							break;
						}
					}
					continue;
				} else if ( !isNum(expressionsArray[i-1]) ) {
					String minusNum = "-";
					for ( int x = i+1 ; ; x++ ){
						if ( x >= expressionsArray.length ) {
							list.add(minusNum);
							break;
						}
						if ( isNum(expressionsArray[x]) ) {
							minusNum += expressionsArray[x];
							i++;
						} else {
							list.add(minusNum);
							break;
						}
					}
					continue;
				}
			} else if ( isNum(expressionsArray[i]) ) {
				String minusNum = String.valueOf(expressionsArray[i]);
				for ( int x = i+1 ; ; x++ ){
					if ( x >= expressionsArray.length ) {
						list.add(minusNum);
						break;
					}
					if ( isNum(expressionsArray[x]) ) {
						minusNum += expressionsArray[x];
						i++;
					} else {
						list.add(minusNum);
						break;
					}
				}
				continue;
			}
			
			if ( expressionsArray[i] == 'e' ) {
				list.add(String.valueOf(E));
				continue;
			}
			
			if ( expressionsArray[i] == 'p' && expressionsArray[i+1] == 'i' ) {
				list.add(String.valueOf(PI));
				i++;
				continue;				
			}
			list.add(String.valueOf(expressionsArray[i]));
			
		}
		if( list.get(0) == "+" ) list.remove(0);
		
		// 계산하는 곳
		try {
			// 괄호 갯수 검사
//			if( leftCount != rightCount ) throw new Exception();
			
			// 괄호 위치 검사
//			for ( int i = 0 ; i < leftCount ; i++ ) {
//				if ( expressions.lastIndexOf("(") > expressions.indexOf(")", expressions.lastIndexOf("(")) ) throw new Exception();
//			}
			
			
			list = calculate(list);
			
			
			
			// 정리된 List 검사 
			System.out.println(df2.format(g) + " " + list);			
		} catch ( Exception e) {
			result = "ERROR";
		}
		
		System.out.println(result);
		}
		// for문 끝 34번 돌리기

	}
	
	private static List<String> calculate(List<String> list) {
		String result = "ERROR";
		while ( true ) {
			int opIndex = list.lastIndexOf("^");
			if ( opIndex == -1 ) break;
			double ans = Math.pow( Double.parseDouble(list.get(opIndex-1)), Double.parseDouble(list.get(opIndex+1)) );
			list.set(opIndex-1, String.valueOf(ans));
			list.remove(opIndex);list.remove(opIndex);
		}
		
		while ( true ) {
			int opIndex1 = list.indexOf("*");
			int opIndex2 = list.indexOf("/");
			
			if ( opIndex1 == -1 && opIndex2 == -1 ) {
				break;
			} else if ( opIndex2 == -1 ) {
				double ans = Double.parseDouble(list.get(opIndex1-1))*Double.parseDouble(list.get(opIndex1+1));
				list.set(opIndex1-1, String.valueOf(ans));
				list.remove(opIndex1);list.remove(opIndex1);
			} else if ( opIndex1 == -1 ) {
				if ( Double.parseDouble(list.get(opIndex2+1)) == 0 ) {
					list.set(opIndex2-1, "ERROR");
				} else {
					double ans = Double.parseDouble(list.get(opIndex2-1))/Double.parseDouble(list.get(opIndex2+1));
					list.set(opIndex2-1, String.valueOf(ans));
				}
				list.remove(opIndex2);list.remove(opIndex2);
			} else if ( opIndex1 < opIndex2 ) {
				double ans = Double.parseDouble(list.get(opIndex1-1))*Double.parseDouble(list.get(opIndex1+1));
				list.set(opIndex1-1, String.valueOf(ans));
				list.remove(opIndex1);list.remove(opIndex1);
			} else {
				if ( Double.parseDouble(list.get(opIndex2+1)) == 0 ) {
					list.set(opIndex2-1, "ERROR");
				} else {
					double ans = Double.parseDouble(list.get(opIndex2-1))/Double.parseDouble(list.get(opIndex2+1));
					list.set(opIndex2-1, String.valueOf(ans));
				}
				list.remove(opIndex2);list.remove(opIndex2);
			}
			
		}
		
		while ( true ) {
			int opIndex1 = list.indexOf("+");
			int opIndex2 = list.indexOf("-");
			
			if ( opIndex1 == -1 && opIndex2 == -1 ) {
				break;
			} else if ( opIndex2 == -1 ) {
				double ans = Double.parseDouble(list.get(opIndex1-1))+Double.parseDouble(list.get(opIndex1+1));
				list.set(opIndex1-1, String.valueOf(ans));
				list.remove(opIndex1);list.remove(opIndex1);
			} else if ( opIndex1 == -1 ) {
				double ans = Double.parseDouble(list.get(opIndex2-1))-Double.parseDouble(list.get(opIndex2+1));
				list.set(opIndex2-1, String.valueOf(ans));
				list.remove(opIndex2);list.remove(opIndex2);
			} else if ( opIndex1 < opIndex2 ) {
				double ans = Double.parseDouble(list.get(opIndex1-1))+Double.parseDouble(list.get(opIndex1+1));
				list.set(opIndex1-1, String.valueOf(ans));
				list.remove(opIndex1);list.remove(opIndex1);
			} else {
				double ans = Double.parseDouble(list.get(opIndex2-1))-Double.parseDouble(list.get(opIndex2+1));
				list.set(opIndex2-1, String.valueOf(ans));
				list.remove(opIndex2);list.remove(opIndex2);
			}
			
		}
		
		return list;
	}

	public static String power(String a, String b) {
		double num = Double.parseDouble(a);
		double times = Double.parseDouble(b);
		return String.valueOf( Math.pow(num, times) );
	}
	
	public static String multiple(String a, String b) {
		return String.valueOf( Double.parseDouble(a) * Double.parseDouble(b) );
	}
	
	public static String divide(String a, String b) {
		return String.valueOf( Double.parseDouble(a) / Double.parseDouble(b) );
	}
	
	public static String sum(String a, String b) {
		return String.valueOf( Double.parseDouble(a) + Double.parseDouble(b) );
	}
	
	public static String subs(String a, String b) {
		return String.valueOf( Double.parseDouble(a) - Double.parseDouble(b) );
	}
	
	public static boolean isNum(char c) {
		if ( c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9' || c == '0' || c == '.')
			return true;
		return false;
	}

}
