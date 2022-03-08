import java.util.*;
public class Anonymous {
	int a=1;
	public int factorial(int b) {
		for(int i=1;i<=b;i++) {
			a=a*i;
		}
		return a;
	}
	public void display(int a) {
		
		System.out.println("the factorial is: "+a);}
}
class Anonymous1{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number for factorial");
		int a=new Anonymous().factorial(sc.nextInt());
		new Anonymous().display(a);
		sc.close();
	}
}