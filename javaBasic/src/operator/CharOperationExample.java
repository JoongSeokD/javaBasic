package operator;

public class CharOperationExample {
	public static void main(String[] args) {
		char c1 = 'A' + 1;
		char c2 = 'A';
		// char c3 = c2 + 1; // 컴파일 에러 부호 연산은 int로 처리되기때문에 타입캐스팅을 해야한다.
		
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
	}
}
