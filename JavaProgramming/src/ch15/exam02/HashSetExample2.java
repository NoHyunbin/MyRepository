package ch15.exam02;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<>();
		
		Member m1 = new Member("홍길동", 25);
		Member m2 = new Member("홍길동", 25);
		
		System.out.println(m1 == m2);
		System.out.println(m1.equals(m2)); // Object의 equals는 ==랑 같다
		System.out.println(m1.hashCode() == m2.hashCode());
		
		set.add(m1);
		set.add(m2);
		System.out.println(set.size());
		
		System.out.println(m1.getName().hashCode()+m1.getAge());
		System.out.println(m2.getName().hashCode());
			
	}

}
