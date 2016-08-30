package ch07.exam09;

public class CarExample { 
	
	public static void main(String[] args) {
		Car car = new Car();
		
		for ( int i = 1 ; i <= 5 ; i++ ) {
			int problemLocation = car.run();
			if ( problemLocation != -1 ) {
				System.out.println(car.tire[problemLocation].location + " HankookTire로 교체");
				car.tire[problemLocation] = new HankookTire(car.tire[problemLocation].location, 15);
			}
			
			System.out.println("--------------------------");
		}
		
	}

}
