import java.util.*;
public class ExceptionPropagation {
	Scanner sc =new Scanner(System.in);
	void a(int i,int j) {
		int data=i/j;
		System.out.println("the value of data: "+data);
	}
	void b() {
		a(sc.nextInt(),sc.nextInt());
	}
	void c() {
		try {
			b();
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
	}
	public static void main(String args[]) {
		ExceptionPropagation p=new ExceptionPropagation();
		p.c();
	}

}
