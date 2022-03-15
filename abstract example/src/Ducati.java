
abstract class Ducati {
	Ducati(){
		System.out.println("this is the construction of ducati");
	}
	abstract void run();
	void speed() {
		System.out.println("the speed of this bike is 300kmph");
	}

}
class Bike extends Ducati{
	void run() {
		System.out.println("this is the bike which is running in bike class");
	}
}
class Mainbike {
	public static void main(String args[]) {
		//String cats[]= {"s","b","c"};
		//int [][] scores= {{2,3,4},{2,3,4}};
		
		Ducati d;
		d=new Bike();
		d.run();
		d.speed();
	}
}