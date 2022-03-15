import java.io.IOException;

public class ExceptionTest {
	public  static void main(String args[]) throws IOException{
		method1();
		System.out.println("after calling method");
	}
	private static void method1() {
		method2();
	}
	private static void method2() {
		method3();
	}
	private static void method3() {
		throw new NullPointerException();
	}
	
}
