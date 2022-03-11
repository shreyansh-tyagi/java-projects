package covariant;
//import java.util.*;
public class Covariant {

	Covariant method() {
		//return this;
		return new Covariant(); //both the statement are same
	}
	void prints() {
		System.out.println("we are in parent class of covariant");
	}
}
class Covariant1 extends Covariant{
	@Override
	Covariant method() { //overiding the method of class parent in subclass whose return type is reference of class 
		return this;
	}
	void prints() {
		System.out.println("we are in subclass of covariant1");
	}
	
}
class Covariant2 extends Covariant1{
	Covariant method() {
		return this;
	}
	void prints() {
		System.out.println("we are in subclass of covariant2");
	}
}
class MainMethod{
	public static void main(String args[]) {
		Covariant c= new Covariant();
		System.out.println(c.method());
		c.prints();
		Covariant1 c1=new Covariant1();
		System.out.println(c1.method());
		c1.prints();
		Covariant1 c2=new Covariant2();
		System.out.println(c2.method());
		c2.prints();
		((Covariant2)c2.method()).prints(); //typecasting
		new Covariant2().prints();  //anonymous object creation
		((Covariant1)c1).prints();
		
		
	}
}
