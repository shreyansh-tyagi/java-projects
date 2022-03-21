import java.util.*;
public class Joinaz extends Thread{
	Scanner sc=new Scanner(System.in);
	public void run() {
		System.out.println("enter the number: ");
		int n=sc.nextInt();
		int a = 1;
		for(int i=0;i<=n;i++) {
			try {
				Thread.sleep(500);
				a*=i;
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
			finally {
				System.out.println("the multiplication is: "+a);
			}
			
		}
		System.out.println("the multiple of all number is: "+a);
	}

}
