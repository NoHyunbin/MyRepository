package myExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RiotTest {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("a", "b", "c");
		//list.add("d");
		List<String> list2 = new ArrayList<String>();
		list2.add("a");
		list2.add("b");
		list2.add("c");
		list2.add("d");
		list2.remove(2);
		
		list.remove(1);
		System.out.println(list);
		System.out.println(list2);

	}

}
