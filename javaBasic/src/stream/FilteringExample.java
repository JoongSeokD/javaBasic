package stream;

import java.util.Arrays;
import java.util.List;

public class FilteringExample {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("홍길동", "일지매", "강감찬", "강소라", "홍예몽", "일수", "홍길동");
		
		// 중복제거
		names.stream()
		.distinct()
		.forEach(n -> System.out.println(n));
		System.out.println();
		
		// 필터링
		names.stream()
		.filter( n -> n.startsWith("홍"))
		.forEach( n-> System.out.println(n));
		System.out.println();
		
		// 중복 제거 후 필터링
		names.stream().distinct().filter( n-> n.startsWith("홍")).forEach(System.out::println);
		
		
	}
}
