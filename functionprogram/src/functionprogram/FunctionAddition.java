package functionprogram;

import java.util.Scanner;
import java.io.*;

public class FunctionAddition {

	public static void main(String[] args) {
		addition();
		}


public static void addition() {
	Scanner sc =new Scanner(System.in);
	System.out.println("enter the two number");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=a+b;
	System.out.println("the addition of two number is: " +c);
	substraction();
	sc.close();
	
}
public static void substraction() {
	Scanner sc =new Scanner(System.in);
	System.out.println("enter two number for substraction: ");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=a-b;
	System.out.println("the substraction of two  nunber is: "+c);
	sc.close();

}
}