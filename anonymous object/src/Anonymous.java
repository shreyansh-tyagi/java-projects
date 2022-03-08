import java.util.*;
public class Anonymous {
	int a;
	public void factorial(int b) {
		a=1;
		for(int i=0;i<=b;i++) {
			a*=i;
		}
		
	}
	public void display() {System.out.println("the factorial is: "+a);}

}
class Anonymous1{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number for factorial");
		new Anonymous().factorial(sc.nextInt());
		new Anonymous().display();
	}
}