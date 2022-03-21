import java.util.*;
public class Threados extends Thread{
	Scanner sc =new Scanner(System.in);
	public void run() {
		int a=0;
		
		System.out.println("enter the number: ");
		int n=sc.nextInt();
		for(int i=0;i<=n;i++) {
			try {
				Thread.sleep(500);
				a+=i;
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
			finally {
				System.out.println("the addition is: "+a);
			}
			
		}
		System.out.println("the sum of all numner is: "+a);
	}

}
class Threados1 extends Threados {
	public static void main(String args[]) {
		Threados t=new Threados();
		Thread t1=new Thread(t);
		
		// t1.run(sc.nextInt()); //so its not possible to pass the argument inside the run statement
		t1.run();
	}
}
