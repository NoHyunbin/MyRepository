package ch09.exam06;

public class A {
	int field = 10;
	
	
	public void method() {
		final int local = 10;
		class B {
			void method() {
				field = 5;
				// local = 5;
				int result = local + field;
			}
		}
		B b = new B();	// method블록 안에서는 순서를 따진다. 생성문 후에 선언이 올 수 없다.
		
	}
}
