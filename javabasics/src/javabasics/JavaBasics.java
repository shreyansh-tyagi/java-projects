package javabasics;
import java.util.Scanner;

public class JavaBasics {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
		
		System.out.println("enter the value of a and b: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int c=calculator(a,b);
		System.out.println(c);
		System.out.println("enter 0 to exit from the program");
		int d=sc.nextInt();
		if(d==0) {
			System.out.println("exited from program, good bye!");
			break;
		}
		}
	}
	public static int calculator(int a,int b) {
		
		System.out.println("Enter 1 for addition: \nEnter 2 for Substraction: \nEnter 3 for Multiplication: \nEnter 4 division: \n");
		int c=sc.nextInt();
		switch(c) {
		case 1:
			System.out.print("the addition of two number is: ");
			return a+b;
		case 2:
			System.out.println("the substraction of two number is: ");
			return a-b;
		case 3:
			System.out.println("the multiplication of two number is : ");
			return a*b;
		case 4:
			System.out.println("the division of two number is : ");
			return a/b;
		default:
			System.out.println("please select the number from the list");
			return 0;
		}
		
		}
		
			
				
	}


