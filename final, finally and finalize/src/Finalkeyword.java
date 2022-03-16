import java.util.*;
public class Finalkeyword {

void finalmethod(final int a) //the value of a cannot be change now as it is final value 
{
	Scanner sc =new Scanner(System.in);
	System.out.println("\nenter the element to divide the final number: ");
	int b=a/sc.nextInt();
	try {
		
		
		System.out.print("\ndivision with final integer is: "+b);
	}
	catch(Exception e) {
		System.out.println(e);
	
		
	}
	finally { //finally is the block which will execute no matter the exception occur or not 
		System.out.println("\nfinally the value of b: "+b);
		
	}
	sc.close();
	
}
protected void  finalize() {
	System.out.println("\nwe are in finalize method ");
	
}

}
class Mainfinal{
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		Finalkeyword f=new Finalkeyword();
		System.out.println("enter the number: ");
		f.finalmethod(sc.nextInt());
		f.finalize();
		sc.close();
	}
}