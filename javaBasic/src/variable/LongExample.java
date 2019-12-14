package variable;

public class LongExample {
	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L;
		
		//long var3 = 100_000_000_000_0; // 컴파일 에러
		long var4 = 100_000_000_000_0L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	}
}
