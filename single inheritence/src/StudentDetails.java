import java.util.*;
public class StudentDetails {
	String name;
	int age;
	StudentDetails(String name,int age){
		this.name=name;
		this.age=age;
		System.out.println("your name: "+name+"\nyour age: "+age);
	}
}
class StudentDetails1 extends StudentDetails{

	int salary;
	StudentDetails1(String name, int age,int salary) {
		super(name, age);
		this.salary=salary;
		System.out.println("your name: "+name+"\nyour age: "+age+"\nyour salary is: "+salary);
	}
	void display() {
		System.out.println("your name: "+name+"\nyour age: "+age+"\nyour salary is: "+salary);
	}
}
class Mainmethod{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name,age and salary:  ");
		StudentDetails1 sobj=new StudentDetails1(sc.nextLine(),sc.nextInt(),sc.nextInt());
		sobj.display();
		sc.close();
	}
}
