import java.util.*;
public class Overloading { //overloading with same method name but different parameter
	public static int add(int a,int b) {  //return type is integer
		return a+b;
	}
	public static int add(int a,int b,int c) {
		return a+b+c;
	}
	public static double add(double a,double b) {//method overloading with same name and same number of parameter but different type of parameter and different return type
		return a+b;
	}

}
class Overloadingtest{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("addition of two number is: "+Overloading.add(sc.nextInt(),sc.nextInt()));
	//calling a function add in print statement without creating object of a class by a class name and passing the argument inside it
		System.out.println("addition of three number is: "+Overloading.add(sc.nextInt(),sc.nextInt(),sc.nextInt()));
		System.out.println("addition of two number is: "+Overloading.add(sc.nextDouble(),sc.nextDouble()));
		sc.close();
	}
	
}