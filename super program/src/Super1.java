import java.util.*;
public class Super1 {
	int[] add;
	int n;
	Scanner sc=new Scanner(System.in);
	Super1(int n){
		this.n=n;
	}
	int factorial() {
		System.out.println("enter the element into the array: ");
		int fact=1;
		for(int i=0;i<=n;i++) {
			add[i]=sc.nextInt();
		}
		for(int i=0;i<=n;i++) {
			fact*=add[i];
		}
		return fact;
		
	}
}
	
class Super2 extends Super1{
		Super2(int n){
			super(n);	
		}
		int a=super.factorial();
		void display() {
		System.out.println("the factorial is: "+a);}
		int factorial() {
			int sum=0;
			for(int i=0;i<=n;i++) {
							sum+=super.add[i];
						}
			return sum;
		}
		
		
	}
class Mainmethod{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		Super2 s=new Super2(sc.nextInt());
		s.factorial();
		sc.close();
		}
}


