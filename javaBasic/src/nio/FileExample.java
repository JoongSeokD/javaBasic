package nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileExample {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("javaBasic/src/nio/FileExample.java");
		System.out.println("���丮 ���� : " + Files.isDirectory(path));
		System.out.println("���� ���� : " + Files.isRegularFile(path));
		System.out.println("������ ���� �ð� : " + Files.getLastModifiedTime(path));
		System.out.println("���� ũ�� : " + Files.size(path));
		System.out.println("������ : " + Files.getOwner(path));
		System.out.println("���� ���� ���� : " + Files.isHidden(path));
		System.out.println("�б� ���� ���� : " + Files.isReadable(path));
		System.out.println("���� ���� ���� : " + Files.isWritable(path));
	}
}
