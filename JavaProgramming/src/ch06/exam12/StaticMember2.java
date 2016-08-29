package ch06.exam12;

public class StaticMember2 {
	// Static Field
	static String field;
	String field2;
	
	// Static Block
	// 로딩이 끝나면 적재가 되면 그 때 실행
	static {
		System.out.println("Static Block 실행");
		field = "자바";
		// field2 = "자바"; 객체가 없어서 불가능
	}
	
	
	// Static Method
	static void method() {
		// field2 = "자바"; 객체가 없어도 실행 되는 부분이라 불가능
	}
	
	void method2() {
		field = "자바";
		field2 = "자바";
	}
	
	public static void main (String[] args) {
		field = "자바";
		// field2 = "자바"; 
		// main도 static 룰을 그대로 따른다.
		// 객체가 없어도 사용할 수 있는 것만 사용 가능하다
		
		method();
		//method2();
		
		StaticMember2 sm = new StaticMember2();
		sm.field2 = "자바";
		sm.method2();
	}
}
