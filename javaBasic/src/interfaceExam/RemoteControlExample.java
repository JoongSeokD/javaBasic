package interfaceExam;

public class RemoteControlExample {
	public static void main(String[] args) {
		
		// 익명 구현
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
