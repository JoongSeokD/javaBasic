package nio;

import java.net.InetSocketAddress;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class ServerExample {
	public static void main(String[] args) {
		ServerSocketChannel channel = null;
		try {
			channel = ServerSocketChannel.open();
			channel.configureBlocking(true);
			channel.bind(new InetSocketAddress(5001));
			while (true) {
				System.out.println("�����ٸ�");
				SocketChannel socketChannel = channel.accept();
				InetSocketAddress isa = (InetSocketAddress) socketChannel.getRemoteAddress();
				System.out.println("���� ������ : " + isa.getHostName());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		if (channel.isOpen()) {
			try {
				channel.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}
}
