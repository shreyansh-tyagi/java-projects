import java.util.*;
public class Naming extends Thread{
	Naming(String name){
		super(name);
	}
	public void run() {
		System.out.println("executing the thread");
	}

}
