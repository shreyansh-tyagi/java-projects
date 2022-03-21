import java.util.*;
public class Naming extends Thread{
	Naming(String name){
		super(name);
	}
	public void run() {
		try {
			Thread.sleep(1000);
			System.out.println("executing the thread");
		}
		catch(InterruptedException e) {
			System.out.println(e);
			
		}
		
	}

}
class Naming1{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string: ");
		Naming n=new Naming(sc.next());
		System.out.println("enter the string: ");
		Naming n1=new Naming(sc.next());
		System.out.println("thread n:- "+n.getName());
		System.out.println("thread n1:- "+n1.getName());
		n.start();
		n1.start();
		sc.close();
	}
}
