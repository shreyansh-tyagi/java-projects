package threads;

public class Threading extends Thread{ //inherting threading functionality from thread class
	public void run() { //calling inbuilt run function from thread class to start the execution
		System.out.println("thread is running");
	}
	

}
class Threading1 implements Runnable { //calling the interface from thread class 
	public void run() { //calling run function inside the interface
		System.out.println("thread is running in interface");
	}
}
class Mainthread{
	public static void main(String args[]) {
		Threading t=new Threading();
		Threading1 t1=new Threading1();
		Thread t2= new Thread(t1); //using the constructor thread //creating the object of thread class which is inhgerited in first class
		t2.start();
		t.start();
	}
}