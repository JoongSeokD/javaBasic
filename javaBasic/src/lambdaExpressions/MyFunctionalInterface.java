package lambdaExpressions;

@FunctionalInterface
public interface MyFunctionalInterface {
	
	// 매개변수가 없는 람다식 메소드
//	void method();
	
	// 매개변수가 있는 람다식 메소드
//	void method(int x);
	
	// 리턴값이 있는 람다식 메소드
	int method(int x, int y);
}
