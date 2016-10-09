package preTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Pro4 {
	
    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<Integer>();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String input = br.readLine();
            String[] numStrList = input.split(" ");
            for (String numStr : numStrList) {
                numberList.add(Integer.parseInt(numStr));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        numberList.sort(new MinComparator());
        String min="";

        for (Integer number : numberList) {
            min = min + String.valueOf(number);
        } 
        min = min.trim();
        
        numberList.sort(new MaxComparator());
        String max="";

        for (Integer number : numberList) {
            max = max + String.valueOf(number);
        } 
        max = max.trim();
       
//    	System.out.println(min);
//    	System.out.println(max);
    	
    	System.out.println(Integer.parseInt(min) + Integer.parseInt(max));

    }
    
    public static class MinComparator implements Comparator<Integer> {
		@Override
		public int compare(Integer o1, Integer o2) {
			if ( o1 < 10 ) {
				o1 *= 11;
			}
			
			if ( o2 < 10 ) {
				o2 *= 11;
			}
			return o1-o2;
		}
    }
    
    public static class MaxComparator implements Comparator<Integer> {
		@Override
		public int compare(Integer o1, Integer o2) {
			if ( o1 < 10 ) {
				o1 *= 11;
			}
			
			if ( o2 < 10 ) {
				o2 *= 11;
			}
			return o2-o1;
		}
    }

}
