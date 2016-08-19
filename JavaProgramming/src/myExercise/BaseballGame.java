package myExercise;
import java.util.Scanner;

public class BaseballGame {

	public static void main(String[] args) {
		// random변수 3개
		int n1 = (int) (Math.random() * 9) + 1;
		int n2 = (int) (Math.random() * 9) + 1;
		int n3 = (int) (Math.random() * 9) + 1;
		
		int x1, x2, x3; // 입력받을 변수 
		
		// bCount: ball Count, sCount = strike Count, tryCount = try Count.
		int bCount = 0, sCount = 0, tryCount = 0;
		
		Scanner scanner = new Scanner(System.in);

		while ( n1 == n2 ) {
			n2 = (int) (Math.random() * 9) + 1;
		}
		
		while ( n3 == n1 || n3 == n2 ) {
			n3 = (int) (Math.random() * 9) + 1;
		}

		while( sCount != 3 ) {
			System.out.println("1~9 사이의 서로 다른 3개의 숫자를 입력하세요");
			
			sCount = 0;
			bCount = 0;
			
			x1 = scanner.nextInt();
			x2 = scanner.nextInt();
			x3 = scanner.nextInt();
			
			tryCount++;
			
			if ( x1 == n1 ) {
				sCount++;
			}
			if ( x2 == n2 ) {
				sCount++;
			}
			if ( x3 == n3 ) {
				sCount++;
			}
			
			if ( x1 == n2 || x1 == n3 ) {
				bCount++;
			}
			if ( x2 == n1 || x2 == n3 ) {
				bCount++;
			}
			if ( x3 == n1 || x3 == n2 ) {
				bCount++;
			}
			
			System.out.println(sCount + "Strike " + bCount + "ball 입니다. \n");
		}
		
		System.out.println("3 Strike!!!! ");
		System.out.println(tryCount + "번만에 성공하셨습니다.");
		
	}

}
