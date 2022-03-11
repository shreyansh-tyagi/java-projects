import java.util.*;
public class Super1 {
	
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	Super1(int n){
		this.n=n;
	}
	
	int[] add=new int[n];
	
	int factorial() {
		System.out.println("enter the element into the array: ");
		int fact=1;
		System.out.println(n);
		for(int i=0;i<n;i++) {
			add[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			fact*=add[i];
		}
		return fact;
		
	}
}
	
class Super2 extends Super1{
		
		Super2(int n) {
		super(n);
		
	}


		void display() {
		int a=super.factorial();
		System.out.println("the factorial is: "+a);}
		
		
		int factorial() {
			int sum=0;
			for(int i=0;i<n;i++) {
							sum+=super.add[i];
						}
			return sum;
		}
		
		
	}
class Mainmethod{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array: ");
		Super2 s=new Super2(sc.nextInt());
		s.display();
		int b=s.factorial();
		System.out.println("the addition is: "+b);
		sc.close();
		}
}
