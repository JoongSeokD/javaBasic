package lambdaExpressions;

public class MyFunctionalInterfaceExample {
	public static void main(String[] args) {
		MyFunctionalInterface fi;
		
		// �Ű������� ���� ���ٽ�
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
		

		// �Ű������� �ִ� ���ٽ�
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
