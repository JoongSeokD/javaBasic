package oop;

public class CarOverloding {
	// �ʵ�
	String company = "LeeCar";
	String model = "����ī";
	String color = "����";
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


