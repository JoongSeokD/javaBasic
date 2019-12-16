package oop;

public class ThisConstructorCar {
	// 필드
	String company = "LeeCar";
	String model = "슈퍼카";
	String color = "검정";
	int maxSpeed = 350;
	int speed;

	public ThisConstructorCar() {}
	public ThisConstructorCar(String model) {
		this(model, "은색", 250);
	}
	public ThisConstructorCar(String model, String color) {
		this(model, "은색", 250);
	}
	public ThisConstructorCar(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
