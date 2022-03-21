import java.util.*;
public class Mythread extends Thread {
	Scanner sc =new Scanner(System.in);
	public void run() {
		System.out.println("enter the number: ");
		int a=sc.nextInt();
		System.out.println("the value of b: "+a);
	}

}
class Mythread1 implements Runnable{ // runnable is interface
	public void run() {
		System.out.println("we are in interface");
	}
}
class Mainthread1{
	public static void main(String args[]) {
		Mythread m=new Mythread();
		//Thread t=new Thread(m); //optional //simply we use the class object to start the execution of thread
		m.start();
		Mythread1 m1=new Mythread1(); //while creating the interface we cannot access the method withou creating the object of thread class 
		Thread t=new Thread(m1);
		t.start();
		
	}
}