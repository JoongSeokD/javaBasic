package stream;

import java.util.Arrays;
import java.util.List;

public class StreamPipelinesExample {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
			new Member("ȫ�浿", Member.MALE, 30),
			new Member("������", Member.MALE, 20),
			new Member("������", Member.MALE, 40),
			new Member("������", Member.FEMALE, 20)
		);
		
		double ageAvg = list.stream()
				.filter(m -> m.getSex() ==Member.MALE)
				.mapToInt(Member :: getAge)
				.average()
				.getAsDouble();
		
		System.out.println("���� ��� ���� : " + ageAvg);
				
				
	}
}
