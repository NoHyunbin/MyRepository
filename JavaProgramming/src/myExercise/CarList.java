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
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println(" 번호 \t 차종 \t 남은 수량 \t 배기량\t\t 최고 속도 \t 평균 연비 \t 가격");
		System.out.println("------------------------------------------------------------------------------------------");
		
		for ( int i = 0 ; i < s.length ; i++ ) {
			if( s[i] != null) {
				System.out.println("  " + i + " \t" + s[i].model + "\t" + s[i].amount + "대\t" + s[i].engineDisplacement + "cc\t\t" + s[i].maxSpeed + "km/h \t" + s[i].avgFuelEfficiency + "km/L\t\t" + s[i].price);
			}
		}
		System.out.println("------------------------------------------------------------------------------------------");
	}

}
