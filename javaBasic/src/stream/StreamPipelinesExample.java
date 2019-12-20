package stream;

import java.util.Arrays;
import java.util.List;

public class StreamPipelinesExample {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
			new Member("홍길동", Member.MALE, 30),
			new Member("일지매", Member.MALE, 20),
			new Member("강감찬", Member.MALE, 40),
			new Member("성춘향", Member.FEMALE, 20)
		);
		
		double ageAvg = list.stream()
				.filter(m -> m.getSex() ==Member.MALE)
				.mapToInt(Member :: getAge)
				.average()
				.getAsDouble();
		
		System.out.println("남자 평균 나이 : " + ageAvg);
				
				
	}
}
