import java.util.*;
public interface InterfaceCreation { //interface creation using interface keyword
	// interface cannot have constructor it can only have method and variable of type static and default
	public  static void addition(int addition){
		
		addition+=10;	
		System.out.println("addition is: "+addition);
	}
	
}
 interface InterfaceCreation1 extends InterfaceCreation{
	 public  static void addition(int addition) {
		 
		 addition+=20;
		 System.out.println("addition of another interface is: "+addition);
	 }
	
}
 class InterfaceClass implements InterfaceCreation,InterfaceCreation1{// this is way to access both the interface at a same time using implements keyword and names of interfaces
	 Scanner sc=new Scanner(System.in);
	 public static void main(String args[]) {
		 
		 InterfaceClass c=new InterfaceClass();
		 c.display();
		 
	 }
	 public void display() {
		 System.out.println("enter the element for first interface: ");
		 InterfaceCreation.addition(sc.nextInt());
		 System.out.println("enter the element for second interface: ");
		 InterfaceCreation1.addition(sc.nextInt());
	 }
	 
 }
