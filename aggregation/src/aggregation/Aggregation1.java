package aggregation;
import java.util.*;
public class Aggregation1 {
	int id,age,salary;
	String name;
	Aggregation1(int id,int age,int salary,String name){
		this.id=id;
		this.age=age;
		this.salary=salary;
		this.name=name;
	}

}
class Aggregation2{
	Aggregation1 catchup; //created an aggregation of class 1 and without inheriting accessing the element of class 1 through aggregation
	Aggregation2(int id,int age,int salary,String name,Aggregation1 catchup){
		this.catchup=catchup;
		
	}
	void display() {
		System.out.println("name: "+catchup.name+"\nid: "+catchup.id+"\nage: "+catchup.age+"\nsalary: "+catchup.salary);
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		Aggregation1 ag1=new Aggregation1(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextLine());
		Aggregation2 ag2=new Aggregation2(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextLine(),ag1);
		ag2.display();
		sc.close();
	}
}
