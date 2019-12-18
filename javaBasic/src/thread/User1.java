package thread;

public class User1 extends Thread{
	private Calculator calculator;

	public void setCalculator(Calculator calculaor) {
		this.setName("User1");
		this.calculator = calculaor;
	}
	
	@Override
	public void run() {
		calculator.setMemory(100);
	}
	
}
