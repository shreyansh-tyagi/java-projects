package aggregation;
import java.util.*;
public class Aggregation1 {
	int id,age,salary;
	Aggregation1(int id,int age,int salary){
		this.id=id;
		this.age=age;
		this.salary=salary;
		
	}
	void display() {
		System.out.println("id: "+id+"\nage: "+age+"\nsalary: "+salary);
	}

}
class Aggregation2{
	int age,salary,id;
	Aggregation1 catchup; //created an aggregation of class 1 and without inheriting accessing the element of class 1 through aggregation
	Aggregation2(int id,int age,int salary,Aggregation1 catchup){
		this.id=id;
		this.age=age;
		this.salary=salary;
		this.catchup=catchup;
		
	}
	void display1() {
		System.out.println("id is : "+id+"\nage is: "+age+"\nsalary is : "+salary);
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the id age and salary: ");
		Aggregation1 ag1=new Aggregation1(sc.nextInt(),sc.nextInt(),sc.nextInt());
		System.out.println("enter the id age and salary for aggregation2: ");
		Aggregation2 ag2=new Aggregation2(sc.nextInt(),sc.nextInt(),sc.nextInt(),ag1);
		ag1.display();
		ag2.display1();
		sc.close();
	}
}
