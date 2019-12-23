package nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileCopyMethodExample {
	public static void main(String[] args) throws IOException {
		Path from = Paths.get("javaBasic/src/nio/logo.png");
		Path to = Paths.get("javaBasic/src/nio/logo4.png");
		
		Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
		System.out.println("파일 복사 성공");
	}
}
