package ch10.exam02;

public class Example {

	public static void main(String[] args) {
		try {
			int result = Calculator.sum("10", "ㅁ");
			System.out.println("result : " + result);
		} catch ( NumberFormatException e ) {
			System.out.println("숫자가 입력되지 않았네~");
		}

	}

}
