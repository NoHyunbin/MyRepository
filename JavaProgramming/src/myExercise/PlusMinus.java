package myExercise;

import java.util.Scanner;

public class PlusMinus {

	   public static void main(String[] args) {
	      Scanner scan = new Scanner(System.in);
	      int issue = scan.nextInt();
	      int total = 0;
	      int find = 1;
	      
	      for (int i = 0; i < issue; i++) {
	         int index = scan.nextInt();

	         if (index > 0) {
	            while (true) {
	               if (total >= index) {
	                  if ((total - index) % 2 == 0) {
	                     System.out.println(find - 1);
	                     break;
	                  }
	               }
	               total += find;
	               find++;

	            }
	         }

	         if (index < 0) {
	            while (true) {
	               if (total >= Math.abs(index)) {
	                  if ((total + index) % 2 == 0) {
	                     System.out.println(find - 1);
	                     break;
	                  }
	               }
	               total += find;
	               find++;
	            }
	         }
	      }
	      
	   }
}
