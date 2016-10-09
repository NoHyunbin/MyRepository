package preTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Pro1 {
	
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

        numberList.sort(null);
        int low = 0;
        int high = 0;
        int minDistance = Integer.MAX_VALUE;
        
        for ( int i = 1 ; i < numberList.size() ; i++ ) {
        	if ( (numberList.get(i) - numberList.get(i-1)) < minDistance ) {
        		low = numberList.get(i-1);
        		high = numberList.get(i);
        		minDistance = numberList.get(i) - numberList.get(i-1);
        	}
        }
        System.out.println(low + " " + high);

    }

}
