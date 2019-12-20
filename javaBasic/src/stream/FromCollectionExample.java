package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FromCollectionExample {
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
			new Student("ȫ�浿", 10),
			new Student("������", 10),
			new Student("������", 10)
		);
		
		Stream<Student> stream = studentList.stream();
		
		stream.forEach(s -> System.out.println(s.getName()));
				
	}
}
