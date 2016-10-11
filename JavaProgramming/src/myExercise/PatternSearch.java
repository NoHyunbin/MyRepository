package myExercise;

public class PatternSearch {
	
	public static void main(String[] args) {
		String dd = "baabaaabaabaab";
		int s = 0;
		while( true ) {
			s = dd.indexOf("baab", s);
			if ( s == -1 ) break;
			System.out.println(s);
			s++;
		}
	}

}
