package ch06.exam04;

public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person("박동수", "남자", 25, 170.5);
		
		// 기본적으로 들어가있는 데이터
		System.out.println("이름 : " + p1.name);
		System.out.println("성별 : " + p1.sex);
		System.out.println("나이 : " + p1.age);
		System.out.println(" 키  : " + p1.height);
		System.out.println("결혼 : " + ( p1.married ? "기혼" : "미혼" + "\n"));
		
		// 데이터 수정
		p1.age = 27;
		System.out.println("이름 : " + p1.name);
		System.out.println("성별 : " + p1.sex);
		System.out.println("나이 : " + p1.age);
		System.out.println(" 키  : " + p1.height);
		System.out.println("결혼 : " + ( p1.married ? "기혼" : "미혼" ));
	}

}
