package sampleTest;

import java.util.Scanner;

public class StrangeStars {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		int starNum = 1;
		int blankNum = input/2;
		int signal = 1;
		
		for ( int i = 0 ; i < input ; i++ ) {
			for ( int j = 0 ; j < blankNum ; j++ ) {
				System.out.print(" ");
			}
			
			for ( int j = 0 ; j < starNum ; j++ ) {
				System.out.print("*");
			}
			
			for ( int j = 0 ; j < blankNum ; j++ ) {
				System.out.print(" ");
			}
			
			if ( starNum >= input ) {
				signal = 0;
			}
			if ( signal == 1 ) {
				blankNum--;
				starNum+=2;
			} else {
				blankNum++;
				starNum-=2;
			}
			System.out.println();
		}
		
	}

}
