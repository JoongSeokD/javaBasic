package operator;

public class InfinityAndNaNCheckExample {
	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		
		//double z = x / y;
		double z = x % y;
		
		System.out.println(Double.isInfinite(z));
		System.out.println(Double.isNaN(z));
		
		System.out.println(z + 2); // 문제가 되는 코드
		
		// ==해결 ==
		int a = 5;
		double b = 0.0;
		
		//double z = x / y;
		double c = a % b;
		if (Double.isInfinite(c) || Double.isNaN(c)) {
			System.out.println("값 산출 불가");
		} else {
			System.out.println(c + 2); 
		}
		
		
	}
}
