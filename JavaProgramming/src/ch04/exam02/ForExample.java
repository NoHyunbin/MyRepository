package ch04.exam02;

public class ForExample {

	public static void main(String[] args) {
		int sum = 0;
		double aver = 0;
		
		for ( int i = 0 ; i < 3 ; i++ ) {
			int num = (int) (Math.random() * 6) + 1 ;
			System.out.println((i+1) + "번째 수 : " + num);
			
			sum += num;
		}
		
		aver = sum / 3.0;
		
		System.out.println("주사위의 합 : " + sum);
		System.out.println("주사위의 평균 : " + aver);
		
	}

}
