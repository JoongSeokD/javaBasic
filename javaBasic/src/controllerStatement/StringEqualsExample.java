package controllerStatement;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = "홍길동";
		String strVar2 = "홍길동";
		
		System.out.println("strVar1 과 strVar2 는 참조가 " + (strVar1 == strVar2 ? "같음" : "다름"));
		System.out.println("strVar1 과 strVar2 는 문자열이 " + (strVar1.equals(strVar2) ? "같음" : "다름"));
		
		String strVar3 = new String("홍길동");
		String strVar4 = new String("홍길동");
		
		System.out.println("strVar3 과 strVar4 는 참조가 " + (strVar3 == strVar4 ? "같음" : "다름"));
		System.out.println("strVar3 과 strVar4 는 문자열이 " + (strVar3.equals(strVar4) ? "같음" : "다름"));
		
	}
}
