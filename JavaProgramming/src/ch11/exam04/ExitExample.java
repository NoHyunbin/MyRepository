package ch11.exam04;

public class ExitExample {
	
	public static void main(String[] args) {
		System.setSecurityManager( new SecurityManager() {
			@Override
			public void checkExit(int status) {
				if ( status != 5 ) {
					throw new SecurityException();
				}
				System.out.println(" 으앙 쥬금 ㅠ_ㅠ ");
			}
		});
		
		for ( int i = 0 ; i < 10 ; i ++ ) {
			System.out.println(i);
			try {
				System.exit(i);
			} catch ( SecurityException e ) {
				System.out.println("	** 예외 발생 ** ");
			}
			
		}
		System.out.println("내가 출력될까요?");
	}
	
}
