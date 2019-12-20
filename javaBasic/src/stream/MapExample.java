package stream;

import java.util.Arrays;
import java.util.List;

public class MapExample {
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
			new Student("È«±æµ¿", 10),	
			new Student("ÀÏÁö¸Å", 20),	
			new Student("ÀÌ¸ù·æ", 30)	
		);
		
		studentList.stream()
			.mapToInt(Student :: getScore)
			.forEach(System.out::println);
	}
}
