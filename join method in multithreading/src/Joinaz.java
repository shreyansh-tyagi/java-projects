import java.util.*;
public class Joinaz extends Thread{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a = 1;
	public void run() {
		
		
		
		for(int i=1;i<=n;i++) {
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
		System.out.println("enter the number: ");
		Joinaz j=new Joinaz();
		System.out.println("enter the number: ");
		Joinaz j1=new Joinaz();
		System.out.println("enter the number: ");
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
			j1.join(2500);
		}
		catch(Exception s){
			System.out.println(s);
			
		}
		j2.start();
	}
	
}
