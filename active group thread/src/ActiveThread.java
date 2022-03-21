import java.util.*;
public class ActiveThread extends Thread{
	ActiveThread(String name,ThreadGroup abc){
		super(abc,name);// put ThreadGroup type variable first and then put other variable inside the constructor
		start();
	}
	public void run() {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for (int i=0;i<=n;i++) {
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
		}
sc.close();
System.out.println(Thread.currentThread().getName()+"is the first execution");
	}
}
class MainThreados{
	public static void main(String args[]) {
		ThreadGroup g=new ThreadGroup("the parent of threadGroup");
		ActiveThread a=new ActiveThread("first execute",g);
		ActiveThread b=new ActiveThread("second execute",g);
	}
}