package myExercise;

import java.util.Scanner;

public class SellCar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CarList[] carList = new CarList[100];			// 차량 목록
		Customer[] customer = new Customer[100];		// 고객 명단
		int view = 1; 									// 판매자 View 고객 View 선택 변수
		String selector;								// 목록 선택 변수
		boolean exit = false;							// 프로그램 종료 Signal
		
		// 초기 목록
		carList[0] = new CarList("Benz    ", 5, 3000, 330, 9, 100000000);
		carList[1] = new CarList("Macerati", 5, 3000, 330, 9, 100000000);
		carList[2] = new CarList("BMW     ", 5, 3000, 330, 9, 100000000);
		
		customer[0] = new Customer("노현빈", "Benz", "auto", "black", 50000, 12345);
		customer[1] = new Customer("배재환", "Ferrari", "auto", "white", 50000, 12345);
		customer[2] = new Customer("박성수", "BMW", "auto", "blue", 50000, 12345);

		while ( true ) {
			
			switch(view){
			case 1 : // 판매자 시점 View
				
				System.out.println("\n------------------------");
				System.out.println("|      판매자 모드     | ");
				System.out.println("-----------------------------------------------------------------------------------");
				System.out.println("1. 차량 목록 | 2. 예약 현황 | 3. 판매 내역 | 4. 차량 추가 | 5. 종료 | 9. 고객 View");
				System.out.println("-----------------------------------------------------------------------------------\n");
				System.out.print("번호를 선택하세요 : ");

				selector = scanner.nextLine();
				System.out.println();
			
				switch ( selector ) {
				case "1" :
//					CarList.nullCheck();
					CarList.printList(carList);
					break;
					
				case "2" :
					Customer.printList(customer);
					break;					
					
				case "3" :
					
					break;
					
				case "4" :
					
					break;
					
				case "5" :
					exit = true;
					break;
					
				case "9" :
					view = 2;
					System.out.println("       ******* 구매자 모드로 전환됩니다 *********        \n");
					break;
					
				default : 
						
				}
				
				break;
				
				
				
			case 2 : // 고객 시점 View
				
				System.out.println("\n------------------------");
				System.out.println("|      구매자 모드     | ");
				System.out.println("-----------------------------------------------------------------------------------");
				System.out.println("1. 차량 목록 | 2. 예약 | 3. 구입 | 4. 예약 취소 | 5. 종료 | 9. 판매자 View");
				System.out.println("-----------------------------------------------------------------------------------\n");
				System.out.print("번호를 선택하세요 : ");
				
				selector = scanner.nextLine();
				System.out.println();
				
				switch ( selector ) {
				case "1" :
				
					break;
					
				case "2" :
					
					break;
					
				case "3" :
					
					break;
					
				case "4" :
					
					break;
					
				case "5" :
					exit = true;
					break;
					
				case "9" :
					view = 1;
					System.out.println("       ******* 판매자 모드로 전환됩니다 *********        \n");
					break;
					
				default : 
					
				}

				break;
				
			}

			if( exit == true ){
				System.out.println("       ******* 프로그램을 종료합니다 *********        ");
				break;
			}
				
		} // while(프로그램) 종료
		

	} // main 종료

} // class 종료
