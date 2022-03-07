import java.util.*;
import java.io.*;
public class Student {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	String s=sc.nextLine();
}
class Student2{
	public static void main(String args[]) {
		Student s1=new Student();
		System.out.println("your entered the number: "+s1.a+"your entered string: "+s1.s);
	}
}