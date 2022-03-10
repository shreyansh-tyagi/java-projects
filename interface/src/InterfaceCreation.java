import java.util.*;
public interface InterfaceCreation { //interface creation using interface keyword
	// interface cannot have constructor it can only have method and variable of type static and default
	public static void addition(int addition){
		addition+=10;	
	}
}
 interface InterfaceCreation1 extends InterfaceCreation{
	 public static void addition(int addition) {
		 addition+=20;
	 }
	
}
