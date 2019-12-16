package oop;

public class CarOverloding {
	// 필드
	String company = "LeeCar";
	String model = "슈퍼카";
	String color = "검정";
	int maxSpeed = 350;
	int speed;

	public CarOverloding() {}
	public CarOverloding(String model) {
		this.model = model;
	}
	public CarOverloding(String model, String color) {
		this.model = model;
		this.color = color;
	}
	public CarOverloding(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}


