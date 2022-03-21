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
class Joinaz1 extends Joinaz{
	public static void main(String args[]) {
		Joinaz j=new Joinaz();
		Joinaz j1=new Joinaz();
		Joinaz j2=new Joinaz();
		//Thread t=new Thread(j);
		j.start();
		try {
			j.join(1500);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		j1.start();
		try {
			j1.join(1500);
		}
		catch(Exception s){
			System.out.println(s);
			
		}
		j2.start();
	}
	
}
