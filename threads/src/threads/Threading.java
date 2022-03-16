package threads;

public class Threading extends Thread{
	public void run() {
		System.out.println("thread is running");
	}
	

}
class Threading1 implements Runnable {
	public void run() {
		System.out.println("thread is running in interface");
	}
}
class Mainthread{
	public static void main(String args[]) {
		Threading t=new Threading();
		Threading1 t1=new Threading1();
		Thread t2= new Thread(t1); //using the constructor thread 
		t2.start();
		t.start();
	}
}