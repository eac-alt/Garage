package garage;

public class Car extends LandBased {
	public void doAHandbrakeTurn() {
		System.out.println("Screech");

	}
	public Car() {
		setNumOfWheels(4);
		setNumOfPassengers(5);
		setMaxSpeed(150);
		setMethodOfPropulsion("Engine Revs");
		}

	@Override
	public void move() {
		System.out.println("Broom broom");
		super.move();
	}

	@Override
	public void beepBeep() {
		System.out.println("Beep beep");
		super.beepBeep();
	}
}
