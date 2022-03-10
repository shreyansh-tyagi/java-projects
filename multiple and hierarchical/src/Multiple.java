import java.util.*;
public class Multiple {
	int addition;
	Multiple(int addition)
	{
	this.addition=addition+10;
	}
	void display1(){
	System.out.println("\n\n\nthis is addition: "+addition);
	}
}
class InheritMultiple extends Multiple{ //single inheritence
	int substraction;
	InheritMultiple(int addition,int substraction){
		super(addition+10);
		this.substraction=addition-5;
	}
	void display2(){
		System.out.println("\n\n\nthis is addition: "+addition+"this is substraction: "+substraction);
		}
}
class InheritInheritMultiple extends InheritMultiple{ //multi level inheritence
	int multi;
	InheritInheritMultiple(int addition,int substraction,int multi){
		super(addition,substraction);
		this.multi=substraction*10;
	}
	void display3(){
		System.out.println("\n\n\nthis is addition: "+addition+"\nthis is substraction: "+substraction+"\nthis is multiplication: "+multi);
		}
	
}
class Inheritbefore extends InheritInheritMultiple{ //hierarchical inheritence
	float division;
	Inheritbefore(int addition,int substraction,int multi,float division){
		super(addition,substraction,multi);
		this.division=multi/addition;
	}
	void display() {
		System.out.println("\n\n\ndisplay addition is: "+addition+"\ndisplay substraction: "+substraction+"\ndisplay multiplication: "+multi+"\ndisplay division: "+division);
	}
}
class Main1{
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter value for addition,substraction,multiplication,division");
		Inheritbefore b=new Inheritbefore(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextFloat());
		System.out.println("\n\n\naddition: "+b.addition+"\nsubstraction: "+b.substraction+"\nmultiple: "+b.multi+"\ndivision: "+b.division);
		
		b.display1();
		b.display2();
		b.display3();
		b.display();
		sc.close();
		
	}
}