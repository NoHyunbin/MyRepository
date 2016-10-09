package sampleTest;

class A {
	String name;
	String getName() {
		return name;
	}
	
	String greeting() {
		return "class A";
	}
	
	public void setA(String str) {
		name = str;
	}
}

class B extends A {
	String name = "b";
	String greeting() {
		return "class B";
	}
}


public class Client {
	
	public static void main(String[] args) {
		A a = new A();
		A b = new B();
		a.setA("A");
		System.out.println(a.greeting() + "  " + a.getName());
		System.out.println(b.greeting() + "  " + b.getName());
		
	}

}
