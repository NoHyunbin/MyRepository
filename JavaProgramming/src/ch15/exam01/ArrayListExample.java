package ch15.exam01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {

		// List 계열의 컬렉션 생성
		List<String> list = new ArrayList<>();
		
		// 객체 저장
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBatis");
		
		// 저장된 객체수 얻기
		System.out.println("총 객체수 : " + list.size());
		System.out.println();
		
		// 객체 찾기
		String skill = list.get(2);
		System.out.println("list[2] : " + skill);
		System.out.println();
		
		// 전체 객체를 일괄 처리
		for ( int i = 0 ; i < list.size() ; i++ ) {
			String str = list.get(i);
			System.out.println("list[" + i + "] : " + str);
		}
		System.out.println();
		
		for ( String str : list ) {
			System.out.println(str);
		}
		System.out.println();
		
		// 객체 삭제
		list.remove(2);
		list.remove(2);
		list.remove("iBatis");
		//list.remove(new String("iBatis")); 이거도 됨. 내부적으로 equals로 비교하기때문
		System.out.println(list.size());
	}

}
