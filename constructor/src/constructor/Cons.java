package constructor;
import java.util.*;
public class Cons {
	int id,age,salary;
	String name;
	Cons(int i,String s){ //constructor created
		id=i;
		name=s;
	}
	Cons(String s,int i,int a){ //constructor overloading
		id=i;
		name=s;
		age=a;
	}
	Cons(Cons c2){  //copy constructor
		id=c2.id;
		name=c2.name;
		age=c2.age;
		
	}
	Cons(int sal){
		salary=sal;
		
	}
	void display() {
		System.out.println("your name is: "+name+"\n your id is: "+id+"\nyour age is:"+age);
	}
	void salarydisplay() {
		System.out.println("my salary is: "+salary);
	}
	

}
class Cons1{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		//System.out.println("enter the name,id: ");
		Cons c=new Cons(41,"shrey tyagi");
		System.out.println("enter the name,id,age: ");
		Cons c1=new Cons(sc.nextLine(),sc.nextInt(),sc.nextInt());
		Cons c2=new Cons(c1); //copy constructor object creation by passing the reference of copied constructor
		new Cons(sc.nextInt()).salarydisplay(); //anonymous object creation with method calling
		c.display();
		c1.display();
		c2.display();
		sc.close();
		
		
	}
}
