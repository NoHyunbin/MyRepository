package myExercise;

import java.util.Scanner;

public class MathProb {
	static int i = 0;
	static int sum = 0 ;
	static int result = Integer.MAX_VALUE;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		if ( input < 0 ) {
			input = Math.abs(input);
		}
		
		plusMinus(input);
		i = 0;
		sum = 0;
		minusPlus(input);
		System.out.println(result);
		
	}
	
	public static void plusMinus(int input) {
		i++;
		sum += i;
		if( sum == input ) {
			if ( i < result ) {
				result = i;
				sum -= i;
				i--;
				return;
			}
		}
		
		if ( i > input ) {
			sum -= i;
			i--;
			return;
		}
		plusMinus(input);
		minusPlus(input);
		sum -= i;
		i--;
	}
	
	public static void minusPlus(int input) {
		i++;
		sum -= i;
		if( sum == input ) {
			if ( i < result ) {
				result = i;
				sum += i;
				i--;
				return;
			}
		}
		
		if ( i > input ) {
			sum += i;
			i--;
			return;
		}
		
		plusMinus(input);
		minusPlus(input);
		sum += i;
		i--;
	}

}
