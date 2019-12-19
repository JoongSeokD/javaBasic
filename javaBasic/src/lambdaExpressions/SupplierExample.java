package lambdaExpressions;

import java.util.function.IntSupplier;

public class SupplierExample {
	public static void main(String[] args) {
		IntSupplier intSupplier = () -> {
			int num = (int)(Math.random() * 6) + 1;
			return num;
		};
		
//		IntSupplier intSupplier = () -> (int)(Math.random() * 6) + 1;
			
		
		int num = intSupplier.getAsInt();
		System.out.println("´«ÀÇ ¼ö : " + num);
	}
}
