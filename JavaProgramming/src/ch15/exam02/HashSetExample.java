package ch15.exam02;

import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {
		
		// Set 계열 컬렉션 생성
		Set<String> set = new HashSet<>();
		
		// 객체 저장
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("JDBC");
		set.add("Java");
		set.add("iBATIS");
		// 입출력 순서가 같지는 않다
		
		System.out.println(set.size());
		System.out.println();
		
		// 객체를 일괄 처리하기
		Iterator<String> iterator = set.iterator();
		while ( iterator.hasNext() ) {
			String str = iterator.next();
			if(str.equals("JDBC"))
				iterator.remove();
			System.out.println(str);
		}
		System.out.println();
		
		for ( String str : set ) {
			System.out.println(str);

/*		향상된 for문에서 이건 하면 안되용      
			if(str.equals("JDBC"))
				set.remove(str);
*/
		}
		
	}

}
