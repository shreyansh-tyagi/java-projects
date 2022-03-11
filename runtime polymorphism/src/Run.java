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
		 
	}
}
