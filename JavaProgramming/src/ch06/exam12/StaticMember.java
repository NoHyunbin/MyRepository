package ch06.exam12;

public class StaticMember {
	// Static Field
	static String field;
	
	// Static Block
	// 로딩이 끝나면 적재가 되면 그 때 실행
	static {
		System.out.println("Static Block 실행");
		field = "자바";
	}
	
	
	// Static Method
	static void method() {
		
	}
}
