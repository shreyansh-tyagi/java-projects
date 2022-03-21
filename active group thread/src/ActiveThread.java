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

System.out.println(Thread.currentThread().getName()+"is the first execution");
sc.close();
	}
}
class MainThreados{
	public static void main(String args[]) {
		ThreadGroup g=new ThreadGroup("the parent of threadGroup");
		ThreadGroup g1=new ThreadGroup(g,"the child threadgroup");
		ActiveThread a=new ActiveThread("first execute",g);
		System.out.println("executing the first thread");
		ActiveThread b=new ActiveThread("second execute",g);
		System.out.println("executing the second thread");
		ActiveThread c=new ActiveThread("third execute",g1);
		System.out.println("executing the third thread");
		System.out.println("total 1st thread group active: "+g.activeGroupCount());
		System.out.println("total 2nd thread group active: "+g1.activeGroupCount());
		System.out.println("total thread group active: "+g.activeCount());
		System.out.println("the name of parent thread: "+g.getName());
		System.out.println("the name of child thread: "+g1.getName());
		a.run();
		b.run();
		c.run();
		
	}
}