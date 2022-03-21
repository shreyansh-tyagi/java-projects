//import java.util.*;
public class Priorty extends Thread{
	public void run() {
		System.out.println("we are run method");
	}
	public static void main(String args[]) {
		Priorty p=new Priorty();
		Priorty p1=new Priorty();
		Priorty p2=new Priorty();
		System.out.println("lets get the priorty of threads: "+p.getPriority()); //these all will give the same priorty 
		System.out.println("lets get the priorty of threads: "+p1.getPriority());
		System.out.println("lets get the priorty of threads: "+p2.getPriority());
		p.setPriority(6);
		p1.setPriority(7); //setting the priorty of all object of class thread 
		p2.setPriority(8);
		System.out.println("\n\nlets get the priorty of threads: "+p.getPriority()); //these all will give the same priorty 
		System.out.println("lets get the priorty of threads: "+p1.getPriority());
		System.out.println("lets get the priorty of threads: "+p2.getPriority());
		p.start();
	System.out.println("\n\npriority of the current thread is: "+Thread.currentThread().getName()); //by default name of current thread priority is MAIN
	System.out.println("priorty of this thread is: "+Thread.currentThread().getPriority()); //priority of current thread will by default 5
	Thread.currentThread().setPriority(10); //changing the priorty of current thread
	System.out.println("\n\nlets see after changing the priority of current thread: "+Thread.currentThread().getPriority());
	}
}
