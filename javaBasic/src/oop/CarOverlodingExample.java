package oop;

public class CarOverlodingExample {
	public static void main(String[] args) {
		CarOverloding car1 = new CarOverloding();
		System.out.println("car1.company : " + car1.company);
		System.out.println();
		
		CarOverloding car2 = new CarOverloding("자가용");
		System.out.println("car1.company : " + car2.company);
		System.out.println("car1.model : " + car2.model);
		System.out.println();
	
		CarOverloding car3 = new CarOverloding("자가용", "빨강");
		System.out.println("car1.company : " + car3.company);
		System.out.println("car1.model : " + car3.model);
		System.out.println("car1.color : " + car3.color);
		System.out.println();
		
		CarOverloding car4 = new CarOverloding("택시", "검정", 200);
		System.out.println("car1.company : " + car4.company);
		System.out.println("car1.model : " + car4.model);
		System.out.println("car1.color : " + car4.color);
		System.out.println("car1.maxSpeed : " + car4.maxSpeed);
		System.out.println();
		
	}
}
