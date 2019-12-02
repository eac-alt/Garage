package garage;

public class Train extends LandBased {
	public Train() {
		setNumOfWheels(6);
		setNumOfPassengers(300);
		setMaxSpeed(200);
		setMethodOfPropulsion("Engine Revs");
		}
	
	@Override
	public void move() {
		System.out.println("chug chug chug");
		super.move();
	}

	@Override
	public void beepBeep() {
		System.out.println("Choo choo!");
		super.beepBeep();
	}


}
