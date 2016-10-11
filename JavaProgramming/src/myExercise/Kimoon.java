package myExercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Kimoon {
	
	public static void main(String[] args) throws IOException {
		Reader rd = new FileReader("src/myExercise/ex.txt");
		BufferedReader br = new BufferedReader(rd);
		
		int cur = 0;
		int next = 0;
		int max = 0;
		int case1 = Integer.parseInt(br.readLine());
		
		for ( int k = 0 ; k < case1 ; k++ ) {
			int case2 = Integer.parseInt(br.readLine());

			for ( int i = 0 ; i < case2 ; i++ ) {
				String rs = br.readLine();
				String[] num = rs.split(" ");
				int count = 0;
				cur = Integer.parseInt(num[0]);
				next = cur + 1;
				max = Integer.parseInt(num[1]);
				String str1 = null;
				String str2 = null;
				
				while ( cur != max ) {
					str1 = Integer.toBinaryString(cur);
					str2 = Integer.toBinaryString(next);
					
					if ( str1.length() == str2.length() ) {
						for ( int j = 0 ; j < str1.length() ; j++ ) {
							if ( str1.charAt(j) != str2.charAt(j)  ) count++;
						}
					} else {
						for ( int j = 0 ; j < str1.length() ; j++ ) {
							if ( str1.charAt(j) != str2.charAt(j+1)  ) count++;
						}	
						count += str2.length();
					}
					cur++;
					next++;
				}
				System.out.println(count);
			}
		}
	}
}
