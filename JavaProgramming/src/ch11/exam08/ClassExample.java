package ch11.exam08;

public class ClassExample {

	public static void main(String[] args) throws ClassNotFoundException {
		// Class classCar = Car.class;	// Car.class 메모리에 로딩된 그 번지수
		// Class classCar = Class.forName("ch11.exam08.Car");
		Car car = new Car();
		Class classCar = car.getClass();
		
		System.out.println(classCar.getName());
		System.out.println(classCar.getSimpleName());
		System.out.println(classCar.getPackage());
		System.out.println(classCar.getPackage().getName());
	}

}
