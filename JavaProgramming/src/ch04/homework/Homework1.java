package ch04.homework;

public class Homework1 {

	public static void main(String[] args) {		
		// for문 100번 반복
		for ( int i = 1 ; i <= 100 ; i++ ){
			int num1 = (int) (Math.random() * 6) + 1 ; // 주사위1 변수 1~6
			int num2 = (int) (Math.random() * 6) + 1 ; // 주사위2 변수 1~6
			
			// 주사위 2개의 합이 10이면 (num1 , num2) 출력 
			if ( (num1 + num2) == 10 ) {
				System.out.println("(" + num1 + ", " + num2 + ")");
			}
		}
		
	}

}
