package operator;

public class InputDataCheckNaNExample {
	public static void main(String[] args) {
		String userInput = "NaN"; // ����ڷκ��� �Է¹��� ��
		double val = Double.valueOf(userInput); // �Է°��� dobuleŸ������ ��ȯ

		double currentBalance = 10000.0;
		double currentBalance2 = 10000.0;
		
		currentBalance += val; // currentBalance�� NaN�� �����
		System.out.println(currentBalance);
		
		if (Double.isNaN(val)) { // NaN�� �˻�
			System.out.println("NaN�� �ԷµǾ� ó���� �� ����"); 
			val = 0.0;
		}
		
		currentBalance2 += val; // currentBalnace�� ���� �� ����
		System.out.println(currentBalance2);
		
	}
}
