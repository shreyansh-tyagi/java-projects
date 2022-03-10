import java.util.*;
public class StudentDetails {
	String name;
	int age;
	StudentDetails(String name,int age){
		this.name=name;
		this.age=age;
	}
	void display() {
		System.out.println("your name: "+name+"\nyour age: "+age);
	}
}
class StudentDetails1 extends StudentDetails{

	int salary;
	StudentDetails1(String name, int age,int salary) {
		super(name, age);
		this.salary=salary;
		System.out.println("your name: "+name+"\nyour age: "+age);
	}
	void display() {
		System.out.println("your name: "+name+"\nyour age: "+age+"your salary is: "+salary);
	}
}
class Mainmethod{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		StudentDetails pobj=new StudentDetails(sc.nextLine(),sc.nextInt());
		StudentDetails1 sobj=new StudentDetails1(sc.nextLine(),sc.nextInt(),sc.nextInt());
		pobj.display();
		sobj.display();
		sc.close();
	}
}
