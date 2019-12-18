package thread;

public class User2 extends Thread{
	private Calculator calculator;

	public void setCalculator(Calculator calculaor) {
		this.setName("User2");
		this.calculator = calculaor;
	}
	
	@Override
	public void run() {
		calculator.setMemory(50);
	}
	
}
