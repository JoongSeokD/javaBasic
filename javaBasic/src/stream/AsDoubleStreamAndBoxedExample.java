package stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AsDoubleStreamAndBoxedExample {
	public static void main(String[] args) {
		int[] intArr = {1,2,3,4,5};
		
		IntStream intStream = Arrays.stream(intArr);
		intStream.asDoubleStream()
			.forEach(System.out::println);
		
		System.out.println();
		
		intStream = Arrays.stream(intArr);
		
		intStream.boxed()
		.forEach( obj -> System.out.println(obj.intValue()));
				
	}
}
