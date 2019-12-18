package thread;

public class TargetThread extends Thread{
	@Override
	public void run() {
		for (long i = 0; i < 1_000_000_000L; i++) {
			
			
			try {
				Thread.sleep(1500);
				
			} catch (Exception e) {
			}
			
			for (long j = 0; j < 1_000_000_000L; j++) {
				
			}
		}
	}
}
