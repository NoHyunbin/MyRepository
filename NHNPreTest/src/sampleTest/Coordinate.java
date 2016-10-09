package sampleTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Coordinate {
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
        
        int count = 0;
        int sum = 0;
        for (Integer number : numberList) {
        	sum += number;
        	count++;
        }
        
        double avg = (double) sum / count;
        String output = String.valueOf(avg);
        output = output.substring(0, output.indexOf('.')+2);
        System.out.println(output);
        String.valueOf(output);

    }
}
