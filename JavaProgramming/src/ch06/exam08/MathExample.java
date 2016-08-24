package ch06.exam08;

public class MathExample {

	public static void main(String[] args) {
		Math math = new Math();
		math.printInfo("수학 객체가 생성됨");
		
		int result = math.max(7, 5);
		System.out.println(result);
		math.max(5, 8); // 쓰이는 곳은 없지만 이렇게 사용할 수는 없다.
		
		int[] values = { 10, 20, 30, 40, 50 };
		double result1 = math.avg1(values);
		
		double result2 = math.avg2( 10, 20, 30, 40, 50 );
		System.out.println(result2);

	}

}
