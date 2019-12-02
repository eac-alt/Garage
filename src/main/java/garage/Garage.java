package garage;

import java.util.ArrayList;

public class Garage {

		ArrayList<Vehicle> garageContents = new ArrayList<>();

		public boolean addVehicle(Vehicle vehicle) {
			boolean success = this.garageContents.add(vehicle);
			return success;
		}

		public ArrayList<Vehicle> getVehicles() {
			return this.garageContents;
		}

		public void printGarageContents() {
			for (Vehicle v : garageContents) {
				System.out.println(v.getNameOfVehicle());
			}
		}

		public void fixVehicle() {
			for (Vehicle v : garageContents) {
				System.out.println(v.getNameOfVehicle() + "  Cost: £" + v.getCost());
			}
		}

		public void deleteVehicle(int index) {
			for (int i = 0; i < garageContents.size(); i++) {
				if (i == index) {
					garageContents.remove(index);
				}
			}
		}	
		public void deleteVehicle(Vehicle vec) {
			for (Vehicle v : garageContents) {
				System.out.println("This is the name " + v.getNameOfVehicle());
					garageContents.remove(v);
				
			}
		}
}