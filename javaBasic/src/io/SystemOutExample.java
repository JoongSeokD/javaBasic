package io;

import java.io.IOException;
import java.io.OutputStream;

public class SystemOutExample {
	public static void main(String[] args) throws IOException {
		OutputStream os = System.out;
		
		for (byte b = 48; b < 58; b++) {
			os.write(b);
		}
		
		os.write(10); // �����ǵ带 ����ϸ� ���� ������ �Ѿ��.
		
		for (byte b = 97; b < 123; b++) {
			os.write(b);
		}
		
		os.write(10);
		
		String hangul = "�����ٶ󸶹ٻ������īŸ����";
		byte[] hangulBytes = hangul.getBytes();
		os.write(hangulBytes);
		
		os.flush();
		
	}
}
