package operator;

public class SignOperatorExample {
	public static void main(String[] args) {
		int x = -100;
		int result1 =  +x;
		int result2 =  -x;
		System.out.println("result1=" + result1);
		System.out.println("result2=" + result2);
		
		short s = 100;
		
		// 부호 연산의 산출타입은 int타입이 된다.
		// short탕비의 값을 부호연산 하면 int타입으로 바뀌기 떄문에 타입 캐스팅 해야한다.
		// short result3 = -s; // 컴파일 에러
		
		int result3 = -s;
		
		System.out.println("result3=" + result3);
	}
}
