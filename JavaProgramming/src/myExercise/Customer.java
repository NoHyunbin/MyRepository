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
	Customer(String name, String model, String transmission, String color, int downPayment){
		this.name = name;
		this.model = model;
		this.transmission = transmission;
		this.color = color;
		this.downPayment = downPayment;
	}
	

}
