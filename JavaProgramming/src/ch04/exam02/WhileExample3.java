package ch04.exam02;

public class WhileExample3 {

	public static void main(String[] args) throws Exception {
		int num = 0;
		
		while ( true ) {
			num = System.in.read();	
			if ( num != 13 && num != 10 )
				System.out.println(num);
		}
		
	}
	
}
