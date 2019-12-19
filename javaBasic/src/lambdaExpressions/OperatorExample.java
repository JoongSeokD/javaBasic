package lambdaExpressions;

import java.util.function.IntBinaryOperator;

public class OperatorExample {
	private static int[] scores = {92,95,87};
	
	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for (int socre : scores) {
			result = operator.applyAsInt(result, socre);
		}
		return result;
	}
	
	public static void main(String[] args) {
		int max = maxOrMin((a, b) -> {
			return  a>=b ? a : b;
		});
		
		System.out.println("최대값 : " + max);
		
		int min = maxOrMin((a, b) ->{
			return  a<=b ? a : b;
		});
		System.out.println("최대값 : " + min);
	}
}
