package operator;

public class InputDataCheckNaNExample {
	public static void main(String[] args) {
		String userInput = "NaN"; // 사용자로부터 입력받은 값
		double val = Double.valueOf(userInput); // 입력값을 dobule타입으로 변환

		double currentBalance = 10000.0;
		double currentBalance2 = 10000.0;
		
		currentBalance += val; // currentBalance에 NaN이 저장됨
		System.out.println(currentBalance);
		
		if (Double.isNaN(val)) { // NaN을 검사
			System.out.println("NaN이 입력되어 처리할 수 없음"); 
			val = 0.0;
		}
		
		currentBalance2 += val; // currentBalnace의 원래 값 유지
		System.out.println(currentBalance2);
		
	}
}
