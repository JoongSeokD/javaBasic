package controllerStatement;

public class ForMultiplicationTableExample {
	public static void main(String[] args) {
		
		for (int dan = 2; dan <= 9; dan++) {
			System.out.println("*** " + dan + "´Ü ***");
			for (int gop = 1; gop <= 9; gop++) {
				System.out.println(dan + " x " + gop + " = " + (dan * gop));
			}
		}
	}
}
