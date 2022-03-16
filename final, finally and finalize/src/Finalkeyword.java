import java.util.*;
public class Finalkeyword {

void finalmethod(final int a) //the value of a cannot be change now as it is final value 
{
	Scanner sc =new Scanner(System.in);
	System.out.println("enter the element to divide the final number: ");
	int b=a/sc.nextInt();
	try {
		
		
		System.out.print("division with final integer is: "+b);
	}
	catch(Exception e) {
		System.out.println(e);
	
		
	}
	finally { //finally is the block which will execute no matter the exception occur or not 
		System.out.println("finally the value of b: "+b);
	}
}
}
class Mainfinal{
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		Finalkeyword f=new Finalkeyword(sc.nextInt());
	}
}