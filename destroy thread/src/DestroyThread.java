import java.util.*;
public class DestroyThread extends Thread{
	DestroyThread(String name,ThreadGroup tg){
		super(tg,name);
		start();
	}
	public void run() {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
		}
		System.out.println(Thread.currentThread().getName()+"thread has finished executing");
	}

}
