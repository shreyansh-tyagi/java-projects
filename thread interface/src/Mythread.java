import java.util.*;
public class Mythread extends Thread {
	Scanner sc =new Scanner(System.in);
	public void run() {
		int a=sc.nextInt();
		System.out.println("the value of b: "+a);
	}

}
class Mythread1 implements Runnable{
	public void run() {
		System.out.println("we are in interface");
	}
}
class Mainthread{
	public static void main(String args[]) {
		Mythread m=new Mythread();
		m.start();
		
	}
}