package ch09.exam07;

public class A {
	int field = 5;
	
	
	public void method() {
		class B {
			int field = 10;
			B() {
				field = 20;
				this.field = 30;
				A.this.field = 40; // A타입의 객체
			}
		}
		
		B b = new B();	
		System.out.println("B의 field : " + b.field);
		System.out.println("A의 field : " + field);
		
	}
}
