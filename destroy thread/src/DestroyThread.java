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
		DestroyThread d=new DestroyThread("shreyansh",g);
		System.out.println("exwcuting the first thread");
		DestroyThread d1=new DestroyThread("sunny",g1);
		System.out.println("exwcuting the second thread\n");
		DestroyThread d2=new DestroyThread("rajesh",g);
		System.out.println("exwcuting the third thread\n");
		
		Thread[] arr=new Thread[g.activeCount()]; //creating an array of thread type
		int enums=g.enumerate(arr);
		for(int i=0;i<enums;i++) {
			System.out.println("thread "+arr[i].getName()+" is found");
		}
		
		d.join();
		d1.join();
		d2.join();
		//destroying the child thread 
		g1.destroy();
		System.out.println("\n\n"+g1.getName()+" is destroyed");
		//destroying the parent thread
		g.destroy();
		System.out.println(g.getName()+" is destroyed");
		
		
		
	}
}