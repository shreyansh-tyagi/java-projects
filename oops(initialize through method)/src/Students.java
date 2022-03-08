import java.util.*;
public class Students {
	String name;
	int age;
	//Students ss=new Students();
	public void method1(String s,int a) {
		name=s;
		age=a;
	}
	
	public void display() {
		System.out.println("your name is: "+name+"\nyour age is: "+age);
	}
	

}
class Students1{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		Students st=new Students();
		st.method1(sc.nextLine(),sc.nextInt());
		st.display();
		System.out.println("\n\nyour name is :"+st.name+"\nyour age is: "+st.age);
		sc.close();
		
	}
}
