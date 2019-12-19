package operator;

public class InfinityAndNaNCheckExample {
	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		
		//double z = x / y;
		double z = x % y;
		
		System.out.println(Double.isInfinite(z));
		System.out.println(Double.isNaN(z));
		
		System.out.println(z + 2); // ������ �Ǵ� �ڵ�
		
		// ==�ذ� ==
		int a = 5;
		double b = 0.0;
		
		//double z = x / y;
		double c = a % b;
		if (Double.isInfinite(c) || Double.isNaN(c)) {
			System.out.println("�� ���� �Ұ�");
		} else {
			System.out.println(c + 2); 
		}
		
		
	}
}
