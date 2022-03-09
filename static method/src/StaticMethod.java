import java.util.*;
public class StaticMethod {
	int id;
	static String clgname="KIET";
	StaticMethod(String s,int i){
		id=i;
		clgname=s;
	}
	void display() {
		System.out.println("your id is: "+id+"\nyour college name is: "+clgname);
		
	}
}
class Staticmethod{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		StaticMethod m=new StaticMethod(sc.nextLine(),sc.nextInt());
		m.display();
		m.id=12;
		// m.clgname="HRIT"; this will not work as static variable and static method can only be accesseed by class name only
		StaticMethod.clgname="HRIT";
		System.out.println("new updated id is: "+m.id+"your updated college is: "+StaticMethod.clgname);
		sc.close();
	}
}
