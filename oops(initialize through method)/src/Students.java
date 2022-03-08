import java.util.*;
public class Students {
	String name;
	int age;
	public void method1(String s,int a) {
		name=s;
		age=a;
	}
	Students ss=new Students();
	public void display() {
		System.out.println("your name is: "+ss.name+"your age is: "+ss.age);
	}
	

}
class Students1{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		Students st=new Students();
		st.method1(sc.nextLine(),sc.nextInt());
		sc.close();
		
	}
}
