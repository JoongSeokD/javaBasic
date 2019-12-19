package lambdaExpressions;

public class MyFunctionalInterfaceExample {
	public static void main(String[] args) {
		MyFunctionalInterface fi;
		
		// 매개변수가 없는 람다식
//		fi = ()->{
//			String str = "method call1";
//			System.out.println(str);
//		};
//		fi.method();
//
//		fi = ()-> {System.out.println("method call2");};
//		fi.method();
//		
//		fi = () -> System.out.println("method call3");
//		fi.method();
		

		// 매개변수가 있는 람다식
		fi = (x) ->{
			int result = x * 5;
			System.out.println(result);
		};
		fi.method(2);
		
		fi = (x) -> {System.out.println(x*5);};
		fi.method(3);
		
		fi = x -> System.out.println(x);
		fi.method(1);
	}
}
