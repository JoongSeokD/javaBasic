package operator;

public class SignOperatorExample {
	public static void main(String[] args) {
		int x = -100;
		int result1 =  +x;
		int result2 =  -x;
		System.out.println("result1=" + result1);
		System.out.println("result2=" + result2);
		
		short s = 100;
		
		// ��ȣ ������ ����Ÿ���� intŸ���� �ȴ�.
		// short������ ���� ��ȣ���� �ϸ� intŸ������ �ٲ�� ������ Ÿ�� ĳ���� �ؾ��Ѵ�.
		// short result3 = -s; // ������ ����
		
		int result3 = -s;
		
		System.out.println("result3=" + result3);
	}
}
