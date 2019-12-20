package stream;

import java.util.Arrays;
import java.util.List;

public class MapAndReduceExample {
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
				new Student("홍길동", 10),
				new Student("일지매", 20),
				new Student("강감찬", 30)
		);
		
		double avg = studentList.stream()
		// 중간처리 (학생 객체를 점수로 매핑)
		.mapToInt(Student::getScore)
		//최종처리 (평균점수)
		.average()
		.getAsDouble();
		
		System.out.println("평균 점수 : " + avg);
				
	}
}
