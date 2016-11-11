package sampleTest;

import java.util.Stack;
import java.io.BufferedReader;
import java.lang.Exception;
import java.io.InputStreamReader;

public class BracketCheck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {		
		Stack<String> stack = new Stack<>();
		String str = "";
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			str = br.readLine();
		} catch (Exception e) {}
		
		String result = "ok";
		
		for ( int i = 0 ; i < str.length() ; i++ ) {
			if ( str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[' ) {
				stack.push( String.valueOf(str.charAt(i)) );
				continue;
			}
			
			if ( str.charAt(i) == ')' ) {
				if ( stack.empty() ) {
					result = "not ok";
					break;
				} else if ( stack.peek().equals("(") ) {
					stack.pop();
					continue;
				} else {
					result = "not ok";
					break;
				} 
			}
			
			if ( str.charAt(i) == ']' ) {
				if ( stack.empty() ) {
					result = "not ok";
					break;
				} else if ( stack.peek().equals("[") ) {
					stack.pop();
					continue;
				} else {
					result = "not ok";
					break;
				}
			}
			
			if ( str.charAt(i) == '}' ) {
				if ( stack.empty() ) {
					result = "not ok";
					break;
				} else if ( stack.peek().equals("{") ) {
					stack.pop();
					continue;
				} else {
					result = "not ok";
					break;
				}
			}
		}
		
		if ( !stack.empty() ) {
			result = "not ok";
		}
		
		System.out.println(result);
	}

}