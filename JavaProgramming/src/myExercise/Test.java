package myExercise;

public class Test {

	public static void main(String[] args) {
		
		// array output compare
		int[] score = {1, 2, 3};
		System.out.println(score);
		System.out.println(score[0]);
		
		// String output compare
		String name1 = new String("신용권");
		String name2 = new String("신용권");
		String name3 = name2;
		
		boolean x;
		boolean y;
		boolean z;
		
		x = name1 == name2;
		y = name1.equals(name2);
		z = name2 == name3;
		
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		int[] intArray = null;
		System.out.println();
		System.out.println(intArray == null);
	}

}
