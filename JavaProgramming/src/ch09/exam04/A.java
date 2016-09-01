package ch09.exam04;

public class A {
	B b = new B();
	// static B b2 = new B();
	
	public A ( int field ) {
		B b = new B();
	}
	
	void method() {
		B b = new B();
	}

/*	static은 객체 없이도 사용 가능한 것이므로 B를 생성할 수 없다.
	static void method2() {
		B b = new B();
	}
*/	
	
	public class B {
		int field1;
		
		void method1() { }
	
	}

}
