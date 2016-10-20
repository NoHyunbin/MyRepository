package myExercise;

import java.util.ArrayList;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
        String[] numList1 = str.split(" ");
        str = scanner.nextLine();
        String[] a = str.split(" ");
        String result = "";

        for ( int i = 0 ; i < Integer.parseInt(numList1[0]) ; i++ ) {
        	if ( Integer.parseInt(a[i]) < Integer.parseInt(numList1[1]) ) {
        		result +=  a[i] + " ";
        	}
        }
        result = result.trim();
        System.out.println(result);
	}
}
/*
String str = scanner.nextLine();
String[] strArr = str.split(" ");
DecimalFormat df = new DecimalFormat("0.000000000");
int a = Integer.parseInt(strArr[0]);
int b = Integer.parseInt(strArr[1]);
int c = Integer.parseInt(strArr[2]);
System.out.println((a+b)%c);
System.out.println((a%c+b%c)%c);
System.out.println((a*b)%c);
System.out.println((a%c*b%c)%c);
*/
/*
Scanner scanner = new Scanner(System.in);
ArrayList<Integer> numberList = new ArrayList<Integer>();
String str = scanner.nextLine();
String[] numStrList = str.split(" ");
for (String numStr : numStrList) {
    numberList.add(Integer.parseInt(numStr));
} 
numberList.sort(null);
System.out.println(numberList.get(1));
*/