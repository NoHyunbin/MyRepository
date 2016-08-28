package myExercise;

public class CarList {
	// Field
	String model;				// 차종
	int amount;					// 남은 수량
	int engineDisplacement;		// 배기량
	int maxSpeed;				// 최고 속도
	int avgFuelEfficiency;		// 평균 연비
	int price;					// 가격
	
	// Constructor
//	CarList() {};
	CarList(String model, int amount, int engineDisplacement, int maxSpeed, int avgFuelEfficiency, int price){
		this.model = model;
		this.amount = amount;
		this.engineDisplacement = engineDisplacement;
		this.maxSpeed = maxSpeed;
		this.avgFuelEfficiency = avgFuelEfficiency;
		this.price = price;
	};
	
	// Method
/*
	void nullCheck(CarList[] s){
		for ( CarList CL : s ) {
			
		}
		
	}
*/
	
	static void printList(CarList[] s){
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println(" 차종 \t 남은 수량 \t 배기량 \t 최고 속도 \t 평균 연비 \t 가격");
		System.out.println("-----------------------------------------------------------------------------------");
		
		for ( CarList CL : s ) {
			if( CL != null) {
				System.out.println(CL.model + "\t" + CL.amount + "대\t" + CL.engineDisplacement + "cc\t\t" + CL.maxSpeed + "km/h \t" + CL.avgFuelEfficiency + "km/L\t\t" + CL.price);
			}
		}
		System.out.println("-----------------------------------------------------------------------------------");
	}

}
