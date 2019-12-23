package nio;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

public class PathExample {
	public static void main(String[] args) {
		Path path = Paths.get("javaBasic/src/nio/PathExample.java");
		System.out.println("파일명 : " + path.getFileName());
		System.out.println("부모 디렉토리 명 : " + path.getParent().getFileName());
		System.out.println("중첩 경로수 : " + path.getNameCount());
		
		System.out.println();
		for (int i = 0; i < path.getNameCount(); i++) {
			System.out.println(path.getName(i));
		}
		
		System.out.println();
		Iterator<Path> it = path.iterator();
		while (it.hasNext()) {
			Path temp = (Path) it.next();
			System.out.println(temp.getFileName());
		}
		
		
	}
}
