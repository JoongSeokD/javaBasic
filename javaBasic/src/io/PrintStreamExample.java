package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamExample {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("C:/Temp/file.txt");
		PrintStream ps = new PrintStream(fos);
		
		ps.println("[����Ʈ ���� ��Ʈ��]");
		ps.print("��ġ ");
		ps.println("�����Ͱ� ����ϴ� ��ó�� ");
		ps.println("�����͸� ����մϴ�.");
		
		ps.flush();
		ps.close();
		fos.close();
		
	}
}
