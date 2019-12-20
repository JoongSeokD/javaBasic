package stream;

import java.util.Arrays;
import java.util.List;

public class MapExample {
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
			new Student("ȫ�浿", 10),	
			new Student("������", 20),	
			new Student("�̸���", 30)	
		);
		
		studentList.stream()
			.mapToInt(Student :: getScore)
			.forEach(System.out::println);
	}
}
