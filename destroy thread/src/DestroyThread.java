import java.util.*;
//import java.lang.*; 
public class DestroyThread extends Thread{
	DestroyThread(String name,ThreadGroup tg){
		super(tg,name);
		start();
	}
	public void run() {
		Scanner sc=new Scanner(System.in);
		System.out.println("\nenter the number: ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
		}
		System.out.println("\n\n"+Thread.currentThread().getName()+" thread has finished executing");
		sc.close();
	}

}
class DestroyThread1{
	//@SuppressWarnings("removal")
	public static void main(String args[]) throws InterruptedException,SecurityException {
		ThreadGroup g=new ThreadGroup("parent group thread"); //parent thread
		ThreadGroup g1=new ThreadGroup(g,"child group thread"); //child thread 
		ThreadGroup g2=new ThreadGroup(g1,"child of child");
		DestroyThread d=new DestroyThread("shreyansh",g); //first parent thread will execute 
		System.out.println("exwcuting the first thread");
		DestroyThread d1=new DestroyThread("sunny",g1); //atlast child thread will execute 
		System.out.println("exwcuting the second thread\n");
		DestroyThread d2=new DestroyThread("rajesh",g2); //first parent thread will execute 
		System.out.println("exwcuting the third thread\n");
		
		Thread[] arr=new Thread[g.activeCount()]; //creating an array of thread type
		int enums=g.enumerate(arr);
		for(int i=0;i<enums;i++) {
			System.out.println("thread "+arr[i].getName()+" is found");
		}
		System.out.println("\nthe parent group of "+g.getName()+" is "+g.getParent().getName());
		System.out.println("\nthe parent group of "+g1.getName()+" is "+g1.getParent().getName());
		System.out.println("\nthe parent group of "+g2.getName()+" is "+g2.getParent().getName());
		d.join();
		d1.join();
		d2.join();
		//destroying the child thread 
		g1.destroy();
		System.out.println("\n\n"+g1.getName()+" is destroyed");
		if(g1.isDestroyed()==true) {
			System.out.println("\n g1 is destroyed");
		}
		else {
			System.out.println("\n g1 is not destroyed");
		}
		//destroying the parent thread
		g.destroy();
		System.out.println(g.getName()+" is destroyed");
		
		
		
	}
}