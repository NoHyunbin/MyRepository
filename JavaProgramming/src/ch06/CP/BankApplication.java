package ch06.CP;

import java.util.Scanner;

public class BankApplication {
	
		private static Account[] account = new Account[100];
		private static Scanner scanner = new Scanner(System.in);
		
		public static void main(String[] args) {
			boolean run = true;
			while(run) {
				System.out.println("---------------------------------------------------");
				System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
				System.out.println("---------------------------------------------------");
				System.out.print("선택 > ");
				
				int selectNo = Integer.parseInt(scanner.nextLine());
				
				if( selectNo == 1 ){
					createAccount();
				} else if( selectNo == 2 )	{
					accountList();
				} else if( selectNo == 3 )	{
					deposit();
				} else if( selectNo == 4 )	{
					withdraw();
				} else if( selectNo == 5 )	{
					run = false;
				}
				
			}
			
			System.out.println("프로그램 종료");
	
		}
		
		// 계좌 생성 하기
		private static void createAccount() {
			// 작성 위치
			System.out.println("---------");
			System.out.println("계좌생성");
			System.out.println("---------");
			
			System.out.print("계좌번호 : ");
			String ano = scanner.nextLine();
			System.out.print("계좌주 : ");
			String owner = scanner.nextLine();
			System.out.print("초기입금액 : ");
			String balance = scanner.nextLine();
			for ( int i = 0 ; i < account.length ; i++ ) {
				if ( account[i] == null ) {
					account[i] = new Account(ano, owner, Integer.parseInt(balance));
					break;
				}
			}
			System.out.println("결과 : 계좌가 생성되었습니다.");
			
		}
		
		// 계좌 목록 보기
		private static void accountList() {
			// 작성 위치
			System.out.println("---------");
			System.out.println("계좌목록");
			System.out.println("---------");
			
			for ( Account acc : account ) {
				if ( acc != null ) {
					System.out.println(acc.getAno() + "\t\t" + acc.getOwner() + "\t" + acc.getBalance());
				}
			}

		}
		
		// 예금하기
		private static void deposit() {
			// 작성 위치
			System.out.println("---------");
			System.out.println("예금");
			System.out.println("---------");
			
			System.out.print("계좌번호 : ");
			String ano = scanner.nextLine();
			if ( findAccount(ano) != null ) {
				Account depAcc = findAccount(ano);
				System.out.print("예금액 : ");
				depAcc.setBalance(depAcc.getBalance() + Integer.parseInt(scanner.nextLine()));
				System.out.println("예금이 성공되었습니다.");
			} else {
				System.out.println("입력하신 계좌가 없습니다.");
			}
			
		}
		
		// 출금하기
		private static void withdraw() {
			// 작성 위치
			System.out.println("---------");
			System.out.println("출금");
			System.out.println("---------");
			
			System.out.print("계좌번호 : ");
			String ano = scanner.nextLine();
			if ( findAccount(ano) != null ) {
				Account depAcc = findAccount(ano);
				System.out.print("출금액 : ");
				depAcc.setBalance(depAcc.getBalance() - Integer.parseInt(scanner.nextLine()));
				System.out.println("출금이 성공되었습니다.");
			} else {
				System.out.println("입력하신 계좌가 없습니다.");
			}
		}
		
		// Account 배열세어 ano와 동일한 Account 객체 찾기
		private static Account findAccount(String ano) {
			// 작성 위치
			for ( int i = 0 ; i < account.length ; i++ ) {
				if ( account[i] != null ) {
					if ( account[i].getAno().equals(ano)) {
						return account[i];
					}
				}
			}
		
			return null;
			
		}

}
