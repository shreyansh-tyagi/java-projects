
public class Daemons extends Thread{
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("yes it is daemon threading");
		}
		else {
			System.out.println("no it not daemon");
		}
	}
	public static void main(String args[]) {
		Daemons d=new Daemons();
		Daemons d1=new Daemons();
		Daemons d2=new Daemons();
		d.setDaemon(true);
		d1.setDaemon(false);
		d2.start();
		d1.start();
		d.start();
	}

}
