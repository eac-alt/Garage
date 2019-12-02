package garage;

public class Vehicle {
private	int numOfWheels;
private	int numOfPassengers;
private	int maxSpeed;
private	String methodOfPropulsion;
private String nameOfVehicle;

	public String getNameOfVehicle() {
	return nameOfVehicle;
}

public void setNameOfVehicle(String nameOfVehicle) {
	this.nameOfVehicle = nameOfVehicle;
}

	public void move() {

	}

	public void beepBeep() {
 		
	}
	
	public int getCost() {
	 int cost = (this.numOfWheels * 100)+(this.maxSpeed * 30)+(this.numOfPassengers * 80);
	 	return cost;
	 	
	}

	public void setNumOfWheels(int numOfWheels) {
		this.numOfWheels = numOfWheels;
	}

	public void setNumOfPassengers(int numOfPassengers) {
		this.numOfPassengers = numOfPassengers;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getNumOfWheels() {
		return numOfWheels;
	}

	public int getNumOfPassengers() {
		return numOfPassengers;
	}


	public int getMaxSpeed() {
		return maxSpeed;
	}


	public String getMethodOfPropulsion() {
		return methodOfPropulsion;
	}

	public void setMethodOfPropulsion(String methodOfPropulsion) {
		this.methodOfPropulsion = methodOfPropulsion;
	}
 
}
