package ch05.exam03;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) throws Exception{
		
		    Scanner scanner= new Scanner(System.in); 
		    
			System.out.print("학생 수 : ");
			String strNum=scanner.nextLine();
			int num = Integer.parseInt(strNum);
			int[] scores=new int[num];
			
			
			for(int i=0; i<scores.length; i++ ){
				System.out.print("점수 : ");
				String data =scanner.nextLine();
				scores[i]= Integer.parseInt(data);
			}
				
			
			int sum = 0;
			for( int score : scores){
				sum += score;
			}
			
			System.out.println("합계: " + sum);
			System.out.println("평균: " + (double)sum/scores.length);
			
	}
}


