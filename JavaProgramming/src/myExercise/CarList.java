package myExercise;

public class CarList {
	// Field
	String model;
	int amount;
	int engineDisplacement;
	int price;
	int maxSpeed;
	int avgFuelEfficiency;
	
	// Constructor
	CarList() {};
	CarList(String model, int engineDisplacement, int price, int maxSpeed, int avgFuelEfficiency){
		this.model = model;
		this.engineDisplacement = engineDisplacement;
		this.price = price;
		this.maxSpeed = maxSpeed;
		this.avgFuelEfficiency = avgFuelEfficiency;
	};

}
