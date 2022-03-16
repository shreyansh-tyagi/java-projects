import java.util.*;
public class Nestedtry {
	int i,j,n;
	int arr[]=new int[n];
	Nestedtry(int i,int j,int arr[]) {
		this.i=i;
		this.j=j;
		this.arr=arr;
	}
	
}
class Nestedtry1 extends Nestedtry{
	Scanner sc=new Scanner(System.in);
	Nestedtry1(int i,int j, int arr[]){
		super(i,j,arr);
		
	}
	int data;
	void trycatchmethod() {
	try {
		String s;
		data=i/j;
		System.out.println(data);
		try {
			s=null;
			System.out.println(s.length());
			
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println("\nenter the string: ");
			s=sc.nextLine();
			System.out.println("\nthe length of string: "+s.length());
			
		}
	}
	catch(Exception e) {
		System.out.println(e);
		System.out.println("the division of two number: "+i/(j+2));
		
	}
	}
	
}
