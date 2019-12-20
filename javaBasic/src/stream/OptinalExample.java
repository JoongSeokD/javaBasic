package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptinalExample {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		
		//���1
		OptionalDouble optinal = list.stream()
				.mapToInt(Integer::intValue)
				.average();
		if (optinal.isPresent()) {
			System.out.println("���1_��� : " + optinal.getAsDouble());
		} else {
			System.out.println("���1_��� :  0.0");
		}
		
		
		// ���2
		double avg = list.stream()
				.mapToInt(Integer::intValue)
				.average()
				.orElse(0.0);
		System.out.println("���2_��� : " + avg);
		
		// ���3
		list.stream().mapToInt(Integer::intValue).average().ifPresent(a -> System.out.println("���3_��� : " + a));
		
	}
}
