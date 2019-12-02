package main;

import garage.*;

public class App {

	public static void main(String[] args) {

 Garage garage = new Garage();
 
 Car car = new Car();
 car.setNameOfVehicle("Brum");
 garage.addVehicle(car);
 
 Bike bike = new Bike();
 bike.setNameOfVehicle("Pluto");
 garage.addVehicle(bike);
 
 Jet jet = new Jet();
 jet.setNameOfVehicle("Speedy Gonzalese");
 garage.addVehicle(jet);
 
 Train train = new Train();
 train.setNameOfVehicle("Thomas");
 garage.addVehicle(train);
 
 Motorbike motorbike = new Motorbike();
 motorbike.setNameOfVehicle("Harley");
 garage.addVehicle(motorbike);
 
 garage.fixVehicle();
 
 garage.deleteVehicle(3);
 
 garage.printGarageContents();
 
 garage.deleteVehicle(jet);
 
 garage.printGarageContents();
 
 
	}

}
