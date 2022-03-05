package javabasics;
import java.util.Scanner;

public class JavaBasics {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter the value of a and b: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=calculator(a,b);
		System.out.println(c);
		
	}
	public static int calculator(int a,int b) {
		int c=sc.nextInt();
		System.out.println("Enter 1 for addition: \nEnter 2 for Substraction: \nEnter 3 for Multiplication: \nEnter 4 division: \n");
		switch(c) {
		case 1:
			System.out.print("the addition of two number is: ");
			return a+b;
		case	
		
		}
			
				
	}

}
