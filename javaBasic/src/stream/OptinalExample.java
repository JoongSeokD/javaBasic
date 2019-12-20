package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptinalExample {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		
		//规过1
		OptionalDouble optinal = list.stream()
				.mapToInt(Integer::intValue)
				.average();
		if (optinal.isPresent()) {
			System.out.println("规过1_乞闭 : " + optinal.getAsDouble());
		} else {
			System.out.println("规过1_乞闭 :  0.0");
		}
		
		
		// 规过2
		double avg = list.stream()
				.mapToInt(Integer::intValue)
				.average()
				.orElse(0.0);
		System.out.println("规过2_乞闭 : " + avg);
		
		// 规过3
		list.stream().mapToInt(Integer::intValue).average().ifPresent(a -> System.out.println("规过3_乞痹 : " + a));
		
	}
}
