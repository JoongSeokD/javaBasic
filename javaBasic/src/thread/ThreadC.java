package thread;

public class ThreadC extends Thread{
	public boolean stop = false;
	public boolean work = true;
	
	@Override
	public void run() {
		while (!stop) {
			if (work) {
				System.out.println("ThreadC �۾� ����");
			} else {
				Thread.yield();
			}
		}
		System.out.println("ThreadC ����");
	}
}