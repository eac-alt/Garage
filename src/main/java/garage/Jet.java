package garage;

public class Jet extends AirBased{
	public Jet() {
		setNumOfWheels(3);
		setNumOfPassengers(2);
		setMaxSpeed(2000);
		setMethodOfPropulsion("Engine Revs");
		}
	int numOfWheels = 3;
	int numOfPassengers=2;
	int maxSpeed = 2000;
	String methodOfPropulsion= "Engine roars";
	@Override
	public void doABarrelRoll() {
		System.out.println("Pass the sick bag");
		super.doABarrelRoll();
	}
	String destructiveCapabilities = "Bombs!!!";
	
	@Override
	public void move() {
		System.out.println("Zooom!");
		super.move();
	}
	
}
