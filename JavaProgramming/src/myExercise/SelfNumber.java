package myExercise;

public class SelfNumber {

	public static void main(String[] args) {
		int startNum = 1;
		int s = Cons(21);
		System.out.println(s);

	}
	
	public static int Cons (int x) {
		int sum = 0;
		sum += x;
		while ( x%10 != 0 ) {
			sum += x%10;
			x /= 10;
		}
		return sum;
	}

}

