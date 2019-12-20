package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class SortingExample {
	public static void main(String[] args) {
		// 숫자 요소일 경우
		IntStream intStream = Arrays.stream(new int[] {5,4,3,2,1});
		intStream.sorted()
		.forEach(System.out::print);
		
		System.out.println();
		
		// 객체가 요소일 경우
		List<Student> studentList = Arrays.asList(
			new Student("홍길동", 30),
			new Student("이몽룡", 10),
			new Student("일지매", 20)
		);
		
		studentList.stream().sorted().forEach(s -> System.out.print(s.getScore() + ","));
		System.out.println();
		
		studentList.stream()
			.sorted( Comparator.reverseOrder())
			.forEach(s -> System.out.print(s.getScore() + ","));
	}
}
