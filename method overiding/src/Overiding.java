//import java.util.*;
public class Overiding { //overiding is the process in which subclass use the same method with same parameter as it was define in parent class 
	void method() {
		System.out.println("we are method of class overiding");
	}

}
class Overiding1 extends Overiding{
	public static void main(String args[]) {
		//Scanner s=new Scanner(System.in);
		Overiding1 obj=new Overiding1();
		obj.method();
		Overiding obj1=new Overiding();
		obj1.method();
	}
	void method() {
		System.out.println("we are in method of overiding1");
	}
}
