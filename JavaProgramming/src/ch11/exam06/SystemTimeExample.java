package ch11.exam06;

public class SystemTimeExample {

	public static void main(String[] args) {
		long start = System.nanoTime();
		
		int sum = 0;
		for ( int i = 1 ; i <= 1000000 ; i++ ) {
			sum += i;
		}
		
		long end = System.nanoTime();
		
		System.out.println("걸린 시간 : " + (double) ( end - start ) / 1000000000.0 + "s");
		System.out.println("sum = " + sum);

	}

}
