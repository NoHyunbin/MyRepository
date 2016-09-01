package myExercise;

public class A {
	// Field
	// Constructor
	// Method
	public void method() {
		int value = 1;		// 이 위치의 value는 final의 특성을 가짐
		class B {
			// Field
			// Constructor 
			// Method
			public void method2() {
//				value = 3;
				int result = value + 1;
				System.out.println(result);
			}
		}
		
		B b = new B();
		b.method2();
	}
	
}
