package myExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MathProb2 {
	static int i = 0;
	static int sum = 0 ;
	static int result = Integer.MAX_VALUE;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		int input = scanner.nextInt();
		if ( input < 0 ) {
			input = Math.abs(input);
		}
		
		int result = 2 ;
		list1.add(1);
		list1.add(-1);
//		System.out.println(list1);
		
		while ( input != 1 ) {
			for ( int i = 0 ; i < list1.size() ; i++ ) {
				list2.add(list1.get(i)+result);
				list2.add(list1.get(i)-result);
			}
			
			list1.clear();;
			list1.addAll(list2);
			list2.clear();
//			System.out.println(list1);
			
			if ( list1.contains(input) ) break;
			result ++;
		}
		
		if ( input == 1 || input == -1 ) {
			result = 1;
		}
		
		System.out.println(result);
	
	}

}
