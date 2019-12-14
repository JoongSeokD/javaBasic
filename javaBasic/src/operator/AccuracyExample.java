package operator;

public class AccuracyExample {
	public static void main(String[] args) {
		int apple = 1;
		double priceUnit = 0.1;
		int number = 7;
		
		double result = apple - number*priceUnit;
		
		System.out.println("사과 한개에서 \n0.7 조각을 빼면, \n" + result + "조각이 남는다.");

		System.out.println("================================");
		// 정확하게 계산할때는 보동소수점 타입을 사용하지 않는다
		// 이진 포맷의 가수를 사용하는 부동소수점 타입은 0.1을 정확히 표현할 수 없어 근사치로 처리하기때문에
		// 정확한 계산이 필요할때는 정수 연산으로 변경해서 다음과 같이사용한다.
		
		int apple2 = 1;
		
		int totalPieces = apple2 * 10;
		int number2 = 7;
		int temp = totalPieces - number2;
		
		double result2 = temp/10.0;
		
		System.out.println("사과 한개에서 \n0.7 조각을 빼면, \n" + result2 + "조각이 남는다.");
	}
}
