package preTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Pro2 {
	
    public static void main(String[] args) {
        String[] words = null;
        
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line = br.readLine();
            words = line.split(" ");
        } catch (IOException e) {
            e.printStackTrace();
        }
        

        int count1 = 0;
        int count2 = 0;
        
        for (String word : words) {
        	char[] chWord = word.toCharArray();
        	for ( int i = 0 ; i < chWord.length-1 ; i++ ) {
        		if ( chWord[i] == 'a' || chWord[i] == 'e' || chWord[i] == 'i' || chWord[i] == 'o' || chWord[i] == 'u' ) {
        			if ( chWord[i+1] == 'a' || chWord[i+1] == 'e' || chWord[i+1] == 'i' || chWord[i+1] == 'o' || chWord[i+1] == 'u' )
        				count1++;
            	}	
        	}
        	
        	for ( int i = 0 ; i < chWord.length-2 ; i++ ) {        		
        		if ( chWord[i] != 'a' && chWord[i] != 'e' && chWord[i] != 'i' && chWord[i] != 'o' && chWord[i] != 'u' ) {
        			if ( chWord[i+1] != 'a' && chWord[i+1] != 'e' && chWord[i+1] != 'i' && chWord[i+1] != 'o' && chWord[i+1] != 'u' ) {
        				if ( chWord[i+2] != 'a' && chWord[i+2] != 'e' && chWord[i+2] != 'i' && chWord[i+2] != 'o' && chWord[i+2] != 'u' )
        					count2++;
        			}
            	}	
        	}
        }
        System.out.println(count1);
        System.out.println(count2);

    }

}
