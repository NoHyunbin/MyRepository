package ch05.exam03;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[][] article = new String[100][];
	
		while ( true ) {
			System.out.println("-------------------------------------------------------------------------------");
			System.out.println("1. 목록 | 2. 글쓰기 | 3. 상세 보기 | 4. 수정 | 5. 삭제 | 6. 종료");
			System.out.println("-------------------------------------------------------------------------------");
			System.out.print("선택 : ");
			
			String choice = scanner.nextLine();
			
			if ( choice.equals("1") ) {
				// 1. 목록 을 선택했을 때 실행되는 부분
				// 번호  제목  글쓴이  조회수 
				// 를 표시하는 목록이 나타난다.
				System.out.println("***************************************");
				System.out.println("번호\t제목\t\t글쓴이\t조회수");
				System.out.println("***************************************");
				
				for ( String[] art : article ) {
					if ( art != null )
						System.out.println(art[0] + "\t" + art[1] + "\t\t" + art[2] + "\t   " + art[3]);
				}
			} else if ( choice.equals("2") ){
				// 2. 글쓰기 를 선택했을 때 실행되는 부분
				
				System.out.print("제목을 입력하세요 : ");
				String title = scanner.nextLine();
				System.out.print("내용을 입력하세요(한 줄만 가능) : ");
				String content = scanner.nextLine();
				System.out.print("글쓴이를 입력하세요 : ");
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
				// 3. 상세보기 를 선택했을 때 실행되는 부분
				
				// 입력된 글이 있는지 확인. 있으면 true 없으면 false
				boolean articleIs = false;
				
				// 목록에 글이 없으면 contentIs가 false가 되고 있으면 true가 된다.
				for ( String[] noArticle : article ) {
					if ( noArticle != null ) {
						articleIs = true;
					}
				}
				
				// 입력된 글이 없을 때 다음을 실행하지 않고, continue를 실행해서 while의 처음으로 돌아간다.
				if( articleIs == false ) {
					System.out.println("저장되어있는 글이 없습니다. ");
					continue;
				}
				
				
				System.out.print("보려고 하는 글의 번호를 입력하세요 : ");
				int num = Integer.parseInt(scanner.nextLine());
				System.out.println();
				
				// 입력한 번호에 해당하는 글이 없으면 에러 메세지 출력
				// 있으면 번호, 제목, 글쓴이, 조회수, 내용 출력. 후 조회수 1 증가.
				if ( article[num] == null ) {
					System.out.println("입력하신 번호에 해당하는 글이 없습니다. " );
				} else {
					System.out.println("번호 : " + article[num][0]);
					System.out.println("제목 : " + article[num][1]);
					System.out.println("글쓴이 : " + article[num][2]);
					System.out.println("조회수 : " + article[num][3]);
					System.out.println("내용 : ");
					System.out.println(article[num][4]);
					article[num][3] = String.valueOf( 1 + Integer.parseInt(article[num][3]) );
				}
				
			} else if ( choice.equals("4") ) {
				// 4. 수정 을 선택했을 때 실행되는 부분.
				
				// 입력된 글이 있는지 확인. 있으면 true 없으면 false
				boolean articleIs = false;
				
				// 목록에 글이 없으면 contentIs가 false가 되고 있으면 true가 된다.
				for ( String[] noArticle : article ) {
					if ( noArticle != null ) {
						articleIs = true;
					}
				}
				
				// 입력된 글이 없을 때 다음을 실행하지 않고, continue를 실행해서 while의 처음으로 돌아간다.
				if( articleIs == false ) {
					System.out.println("저장되어있는 글이 없습니다. ");
					continue;
				}
				
				// 입력된 글이 있을 때 출력
				System.out.print("수정할 글의 번호 : ");
				int num = Integer.parseInt(scanner.nextLine());
				
				// 입력된 번호에 일치하는 글이 없는 경우(if), 와 일치하는 글이 있는 경우(else)
				if ( article[num] == null ) {
					System.out.println("입력하신 번호의 글이 없습니다.");
				} else {
					System.out.print("수정할 부분을 선택하세요. : 1. 제목, 2. 내용 " );
					int modNum = Integer.parseInt(scanner.nextLine());
					
					System.out.print("현재 제목 : " + article[num][modNum+1] );
					article[num] = null;
					System.out.println("삭제 되었습니다 ");
				}
				
				
			} else if ( choice.equals("5") ) {
				// 5. 삭제 를 선택했을 때 실행되는 부분
				
				// 입력된 글이 있는지 확인. 있으면 true 없으면 false
				boolean articleIs = false;
				
				// 목록에 글이 없으면 contentIs가 false가 되고 있으면 true가 된다.
				for ( String[] noArticle : article ) {
					if ( noArticle != null ) {
						articleIs = true;
					}
				}
				
				// 입력된 글이 없을 때 다음을 실행하지 않고, continue를 실행해서 while의 처음으로 돌아간다.
				if( articleIs == false ) {
					System.out.println("저장되어있는 글이 없습니다. ");
					continue;
				}
				
				// 입력된 글이 있을 때 출력
				System.out.print("삭제할 글의 번호 : ");
				int num = Integer.parseInt(scanner.nextLine());
				
				// 입력된 번호에 일치하는 글이 없는 경우(if), 와 일치하는 글이 있는 경우(else)
				if ( article[num] == null ) {
					System.out.println("입력하신 번호의 글이 없습니다.");
				} else {
					article[num] = null;
					System.out.println("삭제 되었습니다 ");
				}				
				
			} else if ( choice.equals("6") ) {
				System.out.println("프로그램을 종료합니다. " );
				break;
				
			}
		}
	}

}
