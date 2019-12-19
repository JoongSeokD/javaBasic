package format;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatExample {
	public static void main(String[] args) {
		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("yyyy-MM-dd : " + sdf.format(now));
		
		sdf = new SimpleDateFormat("yyyy�� MM�� dd��");
		System.out.println("yyyy�� MM�� dd�� : " + sdf.format(now));
		
		sdf = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
		System.out.println("yyyy.MM.dd a HH:mm:ss : " + sdf.format(now));
		
		sdf = new SimpleDateFormat("������ E����");
		System.out.println("������ E���� : " + sdf.format(now));
		
		sdf = new SimpleDateFormat("������ D��° ��");
		System.out.println("������ D��° �� : " + sdf.format(now));
		
		sdf = new SimpleDateFormat("�̴��� d��° ��");
		System.out.println("�̴��� d��° �� : " + sdf.format(now));
		
	}
}
