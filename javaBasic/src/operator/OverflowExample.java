package operator;

public class OverflowExample {
	public static void main(String[] args) {
		
		// 문제
		int x = 100_000_0;
		int y = 100_000_0;
		int z = x * y; // int 타입에 저장될 수 있는 값의 범위를 초과하게 되어 쓰레기값을 얻음
		System.out.println(z);
	
		// 해결
		long a = 100_000_0;
		long b = 100_000_0;
		long c = a * b; 
		System.out.println(c);

	}
}
