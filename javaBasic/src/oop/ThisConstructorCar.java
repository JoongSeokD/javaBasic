package oop;

public class ThisConstructorCar {
	// �ʵ�
	String company = "LeeCar";
	String model = "����ī";
	String color = "����";
	int maxSpeed = 350;
	int speed;

	public ThisConstructorCar() {}
	public ThisConstructorCar(String model) {
		this(model, "����", 250);
	}
	public ThisConstructorCar(String model, String color) {
		this(model, "����", 250);
	}
	public ThisConstructorCar(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
