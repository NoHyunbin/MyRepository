package ch04.exam02;

public class WhileExample6 {

	public static void main(String[] args) throws Exception{
		int key = 0;
		int bal = 0;
		
		while( key != 51 ) {
			if ( key != 10 && key != 13 ) {
				System.out.println("--------------------------");
				System.out.println("1. 예금 | 2. 출금 | 3. 종료");
				System.out.println("--------------------------");
				System.out.print("선택 : ");
			}
			
			key = System.in.read();
			
			if ( key == 49 ) {
				bal = bal + 1000;
				System.out.println("현재 잔액 : " + bal + "원");
				System.out.println();
			}
			
			if ( key == 50 ) {
				bal = bal - 500;
				System.out.println("현재 잔액 : " + bal + "원");
				System.out.println();
			}
		
		}
		
		System.out.println("프로그램 종료");
	}

}
