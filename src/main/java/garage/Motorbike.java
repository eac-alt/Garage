package garage;

public class Motorbike extends LandBased implements Tricks {
	public Motorbike() {
	setNumOfWheels(2);
	setNumOfPassengers(2);
	setMaxSpeed(100);
	setMethodOfPropulsion("Engine Revs");
	}
	
	@Override
	public void move() {
		System.out.println("Nyoom");
		super.move();
	}


	@Override
	public void beepBeep() {
		System.out.println("beepidy beep beep");
		super.beepBeep();
	}


	public void doAWheelie() {
		System.out.println("Weeeeee!");
		
	}

}
