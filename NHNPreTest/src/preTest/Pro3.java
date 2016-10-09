package preTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro3 {
	
    public static void main(String[] args) {
        int number = 0;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line = br.readLine();
            number = Integer.parseInt(line);
        } catch (IOException e) {
            e.printStackTrace();
        }

        int reverseNum = 0;
        
        for ( int i = 0 ; i <= 3  ; i++ ) {
        	if ( i == 3 ) {
        		number = -1;
        		break;
        	}
        	
        	reverseNum = Calc.reverseNumber(number);
        	number = number + reverseNum;
        	
        	if ( number == Calc.reverseNumber(number) ) break;
        }
        System.out.println(number);
    }

    static class Calc {
    	public static int reverseNumber (int number) {
        	int reverseNum = 0;
        	
        	while( true ) {
        		reverseNum += number % 10;
        		number /= 10;
        		
        		if ( number == 0 ) break;
        		reverseNum *= 10;
        	}
    		return reverseNum;
    	}
    }
}
