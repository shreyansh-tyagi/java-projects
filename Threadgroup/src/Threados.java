
public class Threados extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String args[]) {
		Threados t=new Threados();
		ThreadGroup t1=new ThreadGroup("parent thread group");
		Thread t2=new Thread(t1,t,"hello1"); //first pass the reference of threadgroup class then the class reference inside the thread class object
		t2.start();
		Thread t3=new Thread(t1,t,"hello2");
		t3.start();
		Thread t4=new Thread(t1,t,"hello3");
		t4.start();
		System.out.println("the name of thread group name: "+Thread.currentThread().getName());
		System.out.println("the name of thredgroup is: "+t1.getName());
		t1.list();
	}
			

}
