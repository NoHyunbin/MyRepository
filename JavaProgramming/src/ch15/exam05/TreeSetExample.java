package ch15.exam05;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		
		TreeSet<Integer> scores = new TreeSet<>();
		
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		// 점수 찾기
		int firstScore = scores.first();
		System.out.println(" first\t: " + firstScore);
		
		int lastScore = scores.last();
		System.out.println("  last\t: " + lastScore);
		System.out.println();
		
		int lowerScore = scores.lower(95);
		System.out.println(" lower\t: " + lowerScore);

		int higherScore = scores.higher(95);
		System.out.println(" higher\t: " + higherScore);
		System.out.println();
		
		int floorScore = scores.floor(95);
		System.out.println(" floor\t: " + floorScore);
		
		int ceilingScore = scores.ceiling(95);
		System.out.println("ceiling\t: " + ceilingScore);
		System.out.println();
		
		// 정렬
		// 기본 상태
		for ( Integer score : scores ) {
			System.out.print(score + ", ");
		}
		System.out.println();

		NavigableSet<Integer> descendingSet = scores.descendingSet();
		for ( Integer score : descendingSet ) {
			System.out.print(score + ", ");
		}
		System.out.println();

		NavigableSet<Integer> ascendingSet = descendingSet.descendingSet();
		for ( Integer score : ascendingSet ) {
			System.out.print(score + ", ");
		}
		System.out.println();System.out.println();
		
		// 범위 검색
		TreeSet<String> words = new TreeSet<>();
		words.add("apple");
		words.add("forever");
		words.add("description");
		words.add("ever");
		words.add("zoo");
		words.add("base");
		words.add("guess");
		words.add("cherry");
		words.add("20");
		words.add("100");
		
		for ( String word : words ) {
			System.out.print(word + ", ");
		}
		System.out.println();System.out.println();
		
		NavigableSet<String> ns = words.descendingSet();
		for ( String word : ns ) {
			System.out.print(word + ", ");
		}
		System.out.println();System.out.println();
		
		Iterator<String> ex = words.descendingIterator();
		while ( ex.hasNext() ) {
			String element = ex.next();
			System.out.print(element + ", ");
		}
		System.out.println();System.out.println();
		
		NavigableSet<String> subSet = words.subSet("c", true, "f", true);
		for ( String word : subSet ) {
			System.out.print(word + ", ");
		}
		System.out.println();System.out.println();
		

	}

}
