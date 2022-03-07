import java.util.*;
class Student {
	Scanner sc=new Scanner(System.in);
	//System.out.println("enter the name: ");
	String s=sc.nextLine();
	//System.out.println("enter the age: ");
	int a=sc.nextInt();
	
	
	public static void main(String args[]) {
		
		Student s1=new Student();
		System.out.println("your name is: "+s1.s+"\nyour age is: "+s1.a);
		
		
	}
	

}
