package oop;

public class DriveCarExample {
	public static void main(String[] args) {
		DriveCar myCar = new DriveCar();
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("현재속도 : " + speed + "km/h");
				
	}
}
