package myExercise;

public class Customer {
	// Field
	String name;			// 고객명
	String model;			// 차종
	String transmission;	// 변속기 종류 - auto, manual
	String color;			// 색상 - black, blue, white, red
	int balance;			// 잔금 - (CarList.price - this.downPayment)
	int downPayment;		// 계약금
	int password;			// 비밀번호
	
	// Constructor
	Customer(){};
	Customer(String name, String model, String transmission, String color, int downPayment, int password){
		this.name = name;
		this.model = model;
		this.transmission = transmission;
		this.color = color;
		this.downPayment = downPayment;
		this.password = password;
	}
	
	// Method
	static void printList(Customer[] s){
		System.out.println("------------------------------------------");
		System.out.println(" 예약자\t 차종 \t 변속기   색상 \t 계약금");
		System.out.println("------------------------------------------");
		
		for ( Customer Cus : s ) {
			if( Cus != null) {
				System.out.println(Cus.name + "\t" + Cus.model + "\t" + Cus.transmission + "\t" + Cus.color + "\t" + Cus.downPayment);
			}
		}
		System.out.println("------------------------------------------");
	}

}
