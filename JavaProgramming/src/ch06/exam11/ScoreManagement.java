package ch06.exam11;

import java.util.Scanner;

public class ScoreManagement {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		Student[] students = null;

		while ( true ) {
			// 총 학생수가 없으면 1번과 7번만 출력하고, 있으면 1~7번을 출력한다.
			System.out.println("-------------------------------------------------------------------------------");
			if ( students == null ) {
				System.out.println("1. 총 학생 수 | 7. 종료");
			} else {
				System.out.println("1. 총 학생 수 | 2. 목록 | 3. 입력 | 4. 삭제 | 5. 최고 점수 | 6. 평균 | 7. 종료");
			}
			System.out.println("-------------------------------------------------------------------------------");
			// 선택할 메뉴 번호를 입력 받는다.
			System.out.print("선택 : ");
			String choice = scanner.nextLine();
			
			if ( choice.equals("1") ) {
				// 1번. 총 학생 수를 선택했을 때 실행되는 부분
				
				System.out.print("총 학생 수 : " );
				int totalNum = Integer.parseInt(scanner.nextLine());
				students = new Student[totalNum];
				
/*				String[] student1 = { "0", "노현빈", "94"};
				students[0] = student1;
				String[] student2 = { "1", "유은지", "95"};
				students[1] = student2;
				String[] student3 = { "2", "김동현", "93"};
				students[2] = student3;
				String[] student4 = { "3", "배재환", "95"};
				students[3] = student4;
*/				
			} else if ( choice.equals("2") ) {
				// 2번. 목록을 선택했을 때 실행되는 부분
				
				System.out.println("***************************************");
				System.out.println(" 학번\t\t이름\t\t점수");
				System.out.println("***************************************");
				
				// null이 아닌 배열일 때의 (학번, 이름, 점수) 를 출력한다.
				for ( int i = 0 ; i < students.length ; i++ ) {
					Student student = students[i];
					if ( student != null )
						System.out.println(student.no + "\t\t" + student.name + "\t\t" + student.score);
				}
/*				
				for ( Student student : students ) {
					if ( student != null )
						System.out.println(" " + student.no + "\t\t" + student.name + "\t\t" + student.score);
				}*/
			} else if ( choice.equals("3") ) {
				// 3번. 입력을 선택했을 때 실행되는 부분
				
				// 입력할 학생의 이름와 점수를 입력 받는다.
				System.out.print("이름 : " );;
				String name = scanner.nextLine();
				System.out.print("점수 : ");
				int score = Integer.parseInt(scanner.nextLine());
				
				// 비어있는 배열을 찾아서 그 위치에 이름과 점수, 그리고 학번을 저장한다.
				for ( int i = 0 ; i < students.length ; i ++ ) {
					if ( students[i] == null ) {
						students[i] = new Student(i, name, score);
						break;
					}
				}
			} else if ( choice.equals("4") ) {
				// 4번. 삭제를 선택했을 때 실행되는 부분
				
				// 입력된 학생이 있는지를 확인. 있으면 true 없으면 false
				boolean someoneIs = false;
				
				// 목록에 학생이 없으면 someoneIs가 false가 되고 있으면 true가 된다.
				for ( Student noOne : students ) {
					if ( noOne != null ) {
						someoneIs = true;
					}
				}
				
				// 입력된 학생이 없을 때 출력되는 문장
				// 다음을 실행하지 않고, continue를 실행해서 while의 처음으로 돌아간다.
				if( someoneIs == false ) {
					System.out.println("입력된 학생이 없습니다. ");
					continue;
				}
				
				// 입력된 학생이 있을 때 출력되는 문장
				System.out.print("삭제할 학생의 학번 : ");
				int x = Integer.parseInt(scanner.nextLine());
				
				// 입력된 번호에 일치하는 학번이 없는 경우(if), 와 일치하는 학번이 있는 경우(else)
				if ( students[x] == null ) {
					System.out.println("입력하신 학번의 학생은 없습니다.");
				} else {
					students[x] = null;
					System.out.println("삭제 되었습니다 ");
				}				
			} else if ( choice.equals("5") ) {
				// 5번. 최고 점수를 선택했을 때 실행되는 부분
				
				// 최고 점수가 몇점인지 찾는 코드. 배열이 null인 경우 실행하지 않는다.
				int max = 0;
				for ( Student student : students ) {
					if ( student != null && max < student.score )
						max = student.score;
				}
				
				System.out.println("***************************************");
				System.out.println(" 학번\t\t이름\t\t점수");
				System.out.println("***************************************");
				
				// 최고 점수와 일치하는 학생을 찾아서 출력한다.
				for ( Student student : students ) {
					if ( student != null && student.score == max ) {
						System.out.println(" " + student.no + "\t\t" + student.name + "\t\t" + student.score);
					}
				}
				
			} else if ( choice.equals("6") ) {
				// 6번. 평균 을 선택했을 때 실행되는 부분
				
				// 입력된 학생의 수를 저장할 count와 점수의 합산을 저장할 sum 변수를 선언한다.
				int count = 0;
				int sum = 0;
				
				// 학생이 있는 배열을 찾고(null이 아닌 배열) 학생이 있으면 count를 1 증가 시키고
				// 학생이 있는 배열의 점수를 sum에 더한다.
				for ( Student student : students ) {
					if ( student != null ) {
						count++;
						sum += student.score;
					}
				}
				
				// 배열의 합(sum) 을 학생 수(count)로 나눠서 평균을 구한다.
				double avg = (double) sum / count;
				
				System.out.println("평균 : " + avg);
							
			} else if ( choice.equals("7") ) {
				break;
			} 
		}

	}

}
