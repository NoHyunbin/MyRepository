package ch07.exam08;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		child.method1();
		child.method2();
		child.method3();
		
		Parent parent = child;
		parent.method1();
		parent.method2();

	}

}
