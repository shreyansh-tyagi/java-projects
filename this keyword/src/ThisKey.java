import java.util.*;
public class ThisKey {
	int rollno;
	int fee;
	String name;
	float sal;
	ThisKey(String name,int rollno,float sal){
		this.rollno=rollno;
		this.name=name;
		this.sal=sal;
	}

	ThisKey(String name,int rollno,float sal,int fee){
		this(name,rollno,sal);
		this.fee=fee;
	}
	void display() {
		System.out.println("roll number: "+rollno+"\nname: "+name+"\nsalary: "+sal+"\nfee: "+fee);
	}
}
class Thiskey1{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		ThisKey k=new ThisKey(sc.nextLine(),sc.nextInt(),sc.nextFloat());
		ThisKey k1=new ThisKey(sc.nextLine(),sc.nextInt(),sc.nextFloat(),sc.nextInt());
		k.display();
		k1.display();
		sc.close();
	}
}