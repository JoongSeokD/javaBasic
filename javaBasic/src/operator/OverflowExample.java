package operator;

public class OverflowExample {
	public static void main(String[] args) {
		
		// ����
		int x = 100_000_0;
		int y = 100_000_0;
		int z = x * y; // int Ÿ�Կ� ����� �� �ִ� ���� ������ �ʰ��ϰ� �Ǿ� �����Ⱚ�� ����
		System.out.println(z);
	
		// �ذ�
		long a = 100_000_0;
		long b = 100_000_0;
		long c = a * b; 
		System.out.println(c);

	}
}
