package operator;

public class AccuracyExample {
	public static void main(String[] args) {
		int apple = 1;
		double priceUnit = 0.1;
		int number = 7;
		
		double result = apple - number*priceUnit;
		
		System.out.println("��� �Ѱ����� \n0.7 ������ ����, \n" + result + "������ ���´�.");

		System.out.println("================================");
		// ��Ȯ�ϰ� ����Ҷ��� �����Ҽ��� Ÿ���� ������� �ʴ´�
		// ���� ������ ������ ����ϴ� �ε��Ҽ��� Ÿ���� 0.1�� ��Ȯ�� ǥ���� �� ���� �ٻ�ġ�� ó���ϱ⶧����
		// ��Ȯ�� ����� �ʿ��Ҷ��� ���� �������� �����ؼ� ������ ���̻���Ѵ�.
		
		int apple2 = 1;
		
		int totalPieces = apple2 * 10;
		int number2 = 7;
		int temp = totalPieces - number2;
		
		double result2 = temp/10.0;
		
		System.out.println("��� �Ѱ����� \n0.7 ������ ����, \n" + result2 + "������ ���´�.");
	}
}
