package ch05.exam03;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[][] article = new String[100][5];
	
		while ( true ) {
			System.out.println("-------------------------------------------------------------------------------");
			System.out.println("1. 목록 | 2. 글쓴이 | 3. 상세 보기 | 4. 수정 | 5. 삭제 | 6. 종료");
			System.out.println("-------------------------------------------------------------------------------");
			System.out.println("선택 : ");
			
			String choice = scanner.nextLine();
			
			if ( choice.equals("1") ) {
				// 1번. 목록 을 선택했을 때 실행되는 부분
				// 번호  제목  글쓴이  조회수 
				// 를 표시하는 목록이 나타난다.
				System.out.println("***************************************");
				System.out.println("번호\t\t제목\t\t글쓴이\t\t조회수");
				System.out.println("***************************************");
				
				for ( String[] art : article ) {
					if ( art != null )
						System.out.println(art[0] + "\t\t" + art[2] + "\t\t" + art[3] + "\t\t" + art[4]);
				}
			} else if ( choice.equals("2") ){
				// 2번. 글쓰기 를 선택했을 때 실행되는 부분
				System.out.println("제목을 입력하세요");
				String title = scanner.nextLine();
				System.out.println("내용을 입력하세요(한 줄만 가능)");
				String content = scanner.nextLine();
				System.out.println("글쓴이를 입력하세요");
				String writer = scanner.nextLine();
				
				// 비어있는 배열을 찾아서 번호, 제목, 글쓴이, 조회수(0), 내용을 입력한다.
				for ( int i = 0 ; i < article.length ; i++ ) {
					if( article[i] == null ) {
						String[] art = { String.valueOf(i), title, writer, "0", content };
						article[i] = art;
						break;
					}
				}
			} else if ( choice.equals("3") ) {
				
			} else if ( choice.equals("4") ) {
				
			} else if ( choice.equals("5") ) {
				
			} else if ( choice.equals("6") ) {
				System.out.println("프로그램을 종료합니다. " );
				break;
				
			}
		}
	}

}
