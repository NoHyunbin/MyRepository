package ch15.exam03;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample1 {
	
	public static void main(String[] args) {
		
		// Map 계열 컬렉션 생성
		Map<String, Integer> map = new HashMap<>();
		
		// Entry 추가
		map.put("홍길동", 85);
		map.put("추가을", 90);
		map.put("홍길동", 95); // 덮어쓰면서 위에껀 사라진다
		map.put("감자바", 81);
		System.out.println(map.size());
		System.out.println();
		
		int score = map.get("홍길동");
		System.out.println(score);
		System.out.println();
		
		// 모든 Entry 일괄처리
		Set<Entry<String, Integer>> set = map.entrySet(); 
		
		for ( Entry<String, Integer> entry : set ) {
			String key = entry.getKey();
			int value = entry.getValue();
			System.out.println(key + " : " + value);	
		}
		System.out.println();
		
		Set<String> set2 = map.keySet();
		for ( String key : set2 ) {
			int value = map.get(key);
			System.out.println(key + " : " + value);	
		}
		System.out.println();
		
		// 객체 삭제 
		map.remove("홍길동");
		Set<String> set3 = map.keySet();
		for ( String key : set3 ) {
			int value = map.get(key);
			System.out.println(key + " : " + value);	
		}
		
	}

}
