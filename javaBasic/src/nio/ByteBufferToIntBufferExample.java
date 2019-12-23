package nio;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.Arrays;

public class ByteBufferToIntBufferExample {
	public static void main(String[] args) {
		int[] wrtieData = {10, 20};
		IntBuffer writeIntBuffer = IntBuffer.wrap(wrtieData);
		ByteBuffer wrtieByteBuffer = ByteBuffer.allocate(writeIntBuffer.capacity() * 4);
		for (int i = 0; i < writeIntBuffer.capacity(); i++) {
			wrtieByteBuffer.putInt(writeIntBuffer.get(i));
		}
		wrtieByteBuffer.flip();
		
		ByteBuffer readByteBuffer = wrtieByteBuffer;
		IntBuffer readIntBuffer =  readByteBuffer.asIntBuffer();
		int[] readData = new int[readIntBuffer.capacity()];
		readIntBuffer.get(readData);
		System.out.println("배열 복원 : " + Arrays.toString(readData));
	}
}
