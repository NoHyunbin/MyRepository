package ch09.exam05;

public class A {
	int field = 10;
	static int field2 = 5;
	

	public static class B {
		int field1;
		static int field2;
		
		void method1() {
//			field = 3;
			field2 = 3;
		}
		
		static void method2() {};
		
	}

}
