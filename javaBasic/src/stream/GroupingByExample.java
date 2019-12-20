package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExample {
	public static void main(String[] args) {
		List<Student2> totalList = Arrays.asList(
				new Student2("홍길동", 10, Student2.Sex.MALE, Student2.City.Seoul),	
				new Student2("성춘향", 6, Student2.Sex.FEMALE, Student2.City.Pusan),	
				new Student2("강감찬", 10, Student2.Sex.MALE, Student2.City.Pusan),	
				new Student2("김수미", 6, Student2.Sex.FEMALE, Student2.City.Seoul)	
			);
		
		Map<Student2.Sex,List<Student2>> mapBySex = totalList.stream()
				.collect(Collectors.groupingBy(Student2::getSex));
		
		System.out.println("[남학생]");
		mapBySex.get(Student2.Sex.MALE).stream().forEach(s -> System.out.print(s.getName() + " "));
		
		System.out.println("\n[여학생]");
		mapBySex.get(Student2.Sex.FEMALE).stream().forEach(s -> System.out.print(s.getName() + " "));
		
		System.out.println();
		
		Map<Student2.City, List<String>> mapByCity = totalList.stream()
				.collect(
					Collectors.groupingBy(
						Student2::getCity, Collectors.mapping(
							Student2:: getName, Collectors.toList()
						)
					)
				);
		
		System.out.println("\n[서울]");
		mapByCity.get(Student2.City.Seoul).stream().forEach(s -> System.out.print(s + " "));

		System.out.println("\n[부산]");
		mapByCity.get(Student2.City.Pusan).stream().forEach(s -> System.out.print(s + " "));
	}
}
