package controllerStatement;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = "ȫ�浿";
		String strVar2 = "ȫ�浿";
		
		System.out.println("strVar1 �� strVar2 �� ������ " + (strVar1 == strVar2 ? "����" : "�ٸ�"));
		System.out.println("strVar1 �� strVar2 �� ���ڿ��� " + (strVar1.equals(strVar2) ? "����" : "�ٸ�"));
		
		String strVar3 = new String("ȫ�浿");
		String strVar4 = new String("ȫ�浿");
		
		System.out.println("strVar3 �� strVar4 �� ������ " + (strVar3 == strVar4 ? "����" : "�ٸ�"));
		System.out.println("strVar3 �� strVar4 �� ���ڿ��� " + (strVar3.equals(strVar4) ? "����" : "�ٸ�"));
		
	}
}
