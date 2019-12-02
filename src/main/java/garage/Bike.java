package garage;

public class Bike extends LandBased implements Tricks {
	
	public Bike() {
		setNumOfWheels(2);
		setNumOfPassengers(1);
		setMaxSpeed(45);
		setMethodOfPropulsion("Pedal power");
		}
	@Override
	public void beepBeep() {
		System.out.println("Honk!");
		super.beepBeep();
	}
	public void doAWheelie() {
		System.out.println("Crash!");
		
	}

	
}
