package sampleTest;

import java.util.Scanner;

public class DrawStars {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		for ( int i = 0 ; i < num ; i++ ) {
			for ( int x = 0 ; x <= i ; x++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
