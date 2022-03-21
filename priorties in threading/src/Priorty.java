//import java.util.*;
public class Priorty extends Thread{
	public void run() {
		System.out.println("we are run method");
	}
	public static void main(String args[]) {
		Priorty p=new Priorty();
		Priorty p1=new Priorty();
		Priorty p2=new Priorty();
		System.out.println("lets get the priorty of threads: "+p.getPriority());
		System.out.println("lets get the priorty of threads: "+p1.getPriority());
		System.out.println("lets get the priorty of threads: "+p2.getPriority());
	}
}
