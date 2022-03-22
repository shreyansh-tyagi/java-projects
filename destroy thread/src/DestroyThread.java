import java.util.*;
//import java.lang.*; 
public class DestroyThread extends Thread{
	DestroyThread(String name,ThreadGroup tg){
		super(tg,name);
		start();
	}
	public void run() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
		}
		System.out.println("\n\n"+Thread.currentThread().getName()+"thread has finished executing");
		sc.close();
	}

}
class DestroyThread1{
	//@SuppressWarnings("removal")
	public static void main(String args[]) throws InterruptedException,SecurityException {
		ThreadGroup g=new ThreadGroup("parent group thread"); //parent thread
		ThreadGroup g1=new ThreadGroup(g,"child group thread"); //child thread 
		DestroyThread d=new DestroyThread("shreyansh",g);
		System.out.println("exwcuting the first thread");
		DestroyThread d1=new DestroyThread("sunny",g);
		System.out.println("exwcuting the second thread\n");
		d.join();
		d1.join();
		//destroying the child thread 
		g1.destroy();
		System.out.println(g1.getName()+"is destroyed");
		//destroying the parent thread
		g.destroy();
		System.out.println(g.getName()+"is destroyed");
		
		
		
	}
}