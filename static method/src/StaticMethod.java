import java.util.*;
public class StaticMethod {
	static int id;
	static String clgname="KIET";
	StaticMethod(String s,int i){
		id=i;
		clgname=s;
		
	}
	static void display() {
		System.out.println("your id is: "+id+"\nyour college name is: "+clgname);
		
	}
}
class Staticmethod1{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		StaticMethod m=new StaticMethod(sc.nextLine(),sc.nextInt());
		StaticMethod.display();
		StaticMethod.id=12;
		// m.clgname="HRIT"; this will not work as static variable and static method can only be accesseed by class name only
		StaticMethod.clgname="HRIT";
		System.out.println("new updated id is: "+m.id+"\nyour updated college is: "+StaticMethod.clgname);
		sc.close();
	}
}
