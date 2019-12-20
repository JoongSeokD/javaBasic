package stream;

import java.util.Arrays;
import java.util.List;

public class FilteringExample {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("ȫ�浿", "������", "������", "���Ҷ�", "ȫ����", "�ϼ�", "ȫ�浿");
		
		// �ߺ�����
		names.stream()
		.distinct()
		.forEach(n -> System.out.println(n));
		System.out.println();
		
		// ���͸�
		names.stream()
		.filter( n -> n.startsWith("ȫ"))
		.forEach( n-> System.out.println(n));
		System.out.println();
		
		// �ߺ� ���� �� ���͸�
		names.stream().distinct().filter( n-> n.startsWith("ȫ")).forEach(System.out::println);
		
		
	}
}
