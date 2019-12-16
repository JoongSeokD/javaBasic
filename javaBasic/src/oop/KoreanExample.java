package oop;

public class KoreanExample {
	public static void main(String[] args) {
		Korean k1 = new Korean("홍길동", "010-234-5234");
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.tel : " + k1.tel);
		
		Korean k2 = new Korean("일지매", "010-222-3333");
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.tel : " + k2.tel);
		
		
	}
}
