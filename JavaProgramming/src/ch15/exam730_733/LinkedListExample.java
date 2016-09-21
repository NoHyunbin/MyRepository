package ch15.exam730_733;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>(200000);
		List<String> list2 = new LinkedList<>();
		
		long startTime = 0;
		long endTime = 0;
		
		
		// 0인덱스에 추가
		startTime = System.nanoTime();
		for ( int i = 0 ; i < 100000 ; i++ ) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린시간 \t: " + (endTime-startTime) + " ns");
		
		startTime = System.nanoTime();
		for ( int i = 0 ; i < 100000 ; i++ ) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린시간 \t: " + (endTime-startTime) + " ns");
		System.out.println();
		
		// 뒤에 추가
		startTime = System.nanoTime();
		for (int i = 0 ; i < 100000 ; i++ ) {
			list2.add("b" + i);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린시간 \t: " + (endTime-startTime) + " ns");
		
		startTime = System.nanoTime();
		for (int i = 0 ; i < 100000 ; i++ ) {
			list1.add("a" + i);
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린시간 \t: " + (endTime-startTime) + " ns");
		

		
	}

}
