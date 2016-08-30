package ch07.exam09;

public class Car {
	// Field
	Tire[] tire = {
			new Tire("앞왼쪽", 6),
			new Tire("앞오른쪽", 2),
			new Tire("뒤왼쪽", 3),
			new Tire("뒤오른쪽", 4)
	};
	// Constructor
	
	
	// Method
	int run() {
		System.out.println("[자동차가 달립니다.]");
		for ( int i = 0 ; i < tire.length ; i++ ){
			if ( tire[i].roll() == false ) { 
				stop();
				return i;
			}
		}
		return -1;
	}
	
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}

}
