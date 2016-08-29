package ch07.exam06.pack1;

public class B {
	// Field
	A a = new A();
	// a = new A(); // 실행문은 여기에 쓰면 안 된다.
	
	// Constructor
	B(){
		A a = new A();
		a.field = 10;
		a.method();
	}
	
	// Method
	void Method() {
		A a = new A();
		a.field = 10;
		a.method();
	}

}
