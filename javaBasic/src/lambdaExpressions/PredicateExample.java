package lambdaExpressions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
	private static List<Student2> list = Arrays.asList(
			new Student2("홍길동", "남자", 90),
			new Student2("일지매", "여자", 90),
			new Student2("곽감찬", "남자", 95),
			new Student2("김자바", "여자", 92)
			);
	
	public static double avg(Predicate<Student2> predicate ) {
		int count = 0, sum = 0;
		for (Student2 student2 : list) {
			if (predicate.test(student2)) {
				count++;
				sum += student2.getScore();
			}
		}
		return (double) sum / count;
	}
	
	public static void main(String[] args) {
		double maleAvg = avg(t -> t.getSex().equals("남자"));
		System.out.println("남자 평균 점수 : " + maleAvg);
		
		double femaleAvg = avg(t -> t.getSex().equals("여자"));
		System.out.println("여자 평균 점수 : " + femaleAvg);
	}
	
}
