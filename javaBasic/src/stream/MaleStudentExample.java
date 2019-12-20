package stream;

import java.util.Arrays;
import java.util.List;

public class MaleStudentExample {
	public static void main(String[] args) {
		List<Student2> totalList = Arrays.asList(
				new Student2("È«±æµ¿", 10, Student2.Sex.MALE),	
				new Student2("¼ºÃáÇâ", 6, Student2.Sex.FEMALE),	
				new Student2("°­°¨Âù", 10, Student2.Sex.MALE),	
				new Student2("±è¼ö¹Ì", 6, Student2.Sex.FEMALE)	
			);
		
		MaleStudent maleStudent = totalList.stream()
				.filter(s -> s.getSex() == Student2.Sex.MALE)
				.collect(MaleStudent :: new, MaleStudent :: accumulate, MaleStudent :: combine);
		
		maleStudent.getList().stream()
		.forEach(s -> System.out.println(s.getName()));
	}
}
