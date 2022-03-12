import java.io.*;
public class Run {
	void running() {
		System.out.println("parent class");
	}

}
class Run1 extends Run{
	void running() {
		System.out.println("child class run1");
	}
}
class Run2 extends Run1{
	void running() {
		System.out.println("we are run2 class");
	}
}
class Runs extends Run{
	void running() {
		System.out.println("we are runs class");
	}	
}
class Mainmthod{
	public static void main(String agrs[]) {
		Run r=new Run();
		Run r1=new Run1();
		Run r2=new Run2();
		Run r3=new Runs();
		r.running();
		r1.running();
		r2.running();
		r3.running();
		System.out.println(r1 instanceof Run1)
		 
	}
}
