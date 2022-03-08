package constructor;
import java.util.*;
public class Cons {
	int id,age;
	String name;
	Cons(int i,String s){ //constructor created
		id=i;
		name=s;
	}
	Cons(int i,String s,int a){ //constructor overloading
		id=i;
		name=s;
		age=a;
	}
	Cons(Cons c2){  //copy constructor
		id=c2.id;
		name=c2.name;
		age=c2.age;
		
	}
	void display() {
		System.out.println("your name is: "+name+"\n your id is: "+id+"\nyour age is:"+age);
	}
	

}
class Cons1{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		Cons c=new Cons(sc.nextInt(),sc.nextLine());
		Cons c1=new Cons(sc.nextInt(),sc.nextLine(),sc.nextInt());
		Cons c2=new Cons(c1);
		c.display();
		c1.display();
		c2.display();
		sc.close();
		
		
	}
}
