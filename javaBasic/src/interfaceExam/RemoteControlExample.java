package interfaceExam;

public class RemoteControlExample {
	public static void main(String[] args) {
		
		// �͸� ����
//		RemoteControl rc = new RemoteControl() {
//			public void turnOn() {}
//			public void turnOff() {}
//			public void setVolume(int volume) {}
//		};
		
		RemoteControl rc = null;
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		
		
		
	}
}
