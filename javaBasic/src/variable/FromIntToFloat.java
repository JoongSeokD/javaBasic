package variable;

public class FromIntToFloat {
	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
		int num4 = 123456780;
		int num5 = 123456780;
		
		float num3 = num2;
		num2 = (int) num3;
		
		double num6 = num4;
		num5 = (int) num6;
		
		int result = num1 - num2;
		
		int result2 = num4 - num5;
		
		System.out.println(result);
		System.out.println(result2);
	}
}
