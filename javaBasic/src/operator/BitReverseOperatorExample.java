package operator;

public class BitReverseOperatorExample {
	public static void main(String[] args) {

		int v1 = 10;
		int v2 = ~v1;
		int v3 = ~v1 + 1;
		System.out.println(toBinaryString(v1) + " (십진수: " + v1 + ")");
		System.out.println(toBinaryString(v2) + " (십진수: " + v2 + ")");
		System.out.println(toBinaryString(v3) + " (십진수: " + v3 + ")");
		System.out.println();
		
		int v4 = -10;
		int v5 = ~v4;
		int v6 = ~v4 + 1;
		System.out.println(toBinaryString(v4) + " (십진수: " + v4 + ")");
		System.out.println(toBinaryString(v5) + " (십진수: " + v5 + ")");
		System.out.println(toBinaryString(v6) + " (십진수: " + v6 + ")");
		
		
	}
	
	/**
	 * Integer.toBinaryString() 메소드는 앞의 비트가 모두 0이면 0은 생략되고 나머지 문자열만 리턴한다.
	 * 따라서 총 32개의 문자열을 모두 얻기 위해서는 리턴하는 str의 문자수를 조사해서 32보다 작으면 0을 붙이도록 한다.
	 * @param value
	 * @return
	 */
	public static String toBinaryString(int value) {
		String str = Integer.toBinaryString(value);
		System.out.println(Integer.toBinaryString(value) + " (Integer.toBinaryString(value))");
		while (str.length() > 32) {
			str = "0" + str;
		}
		return str;
	}
}
