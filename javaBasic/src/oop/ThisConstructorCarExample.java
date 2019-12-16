package oop;

public class ThisConstructorCarExample {
	public static void main(String[] args) {
		ThisConstructorCar car1 = new ThisConstructorCar();
		System.out.println("car1.company : " + car1.company);
		System.out.println();
		
		ThisConstructorCar car2 = new ThisConstructorCar("자가용");
		System.out.println("car1.company : " + car2.company);
		System.out.println("car1.model : " + car2.model);
		System.out.println();
	
		ThisConstructorCar car3 = new ThisConstructorCar("자가용", "빨강");
		System.out.println("car1.company : " + car3.company);
		System.out.println("car1.model : " + car3.model);
		System.out.println("car1.color : " + car3.color);
		System.out.println();
		
		ThisConstructorCar car4 = new ThisConstructorCar("택시", "검정", 200);
		System.out.println("car1.company : " + car4.company);
		System.out.println("car1.model : " + car4.model);
		System.out.println("car1.color : " + car4.color);
		System.out.println("car1.maxSpeed : " + car4.maxSpeed);
		System.out.println();
	}
}
