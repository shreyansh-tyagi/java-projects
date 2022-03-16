import java.util.*;
public class Nestedtry {
	int i,j;
	int arr[];
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
	@SuppressWarnings("null")
	void trycatchmethod() {
	try {
		String s;
		data=i/j;
		System.out.println(data);
		try {
			
			s=null;
			System.out.println(s.length());
			System.out.println("enter the index at which you want updation of array: ");
			int n=sc.nextInt();
			try {
								
				arr[n]=i/j;
				System.out.println("\n\nelement at "+n+"is: "+arr[n]);
			}
			catch(Exception e) {
				System.out.println(e);
				arr[n]=i/(j+2);
				System.out.println("\n\nelement at "+n+"is: "+arr[n]);
				
				
			}
			
			
		}
		catch(Exception e1) {
			System.out.println(e1);
			System.out.println("\nenter the string: ");
			s=sc.nextLine();
			System.out.println("\nthe length of string: "+s.length());
			
		}
	}
	catch(Exception e2) {
		System.out.println(e2);
		System.out.println("\nthe division of two number: "+i/(j+2));
		
	}
	}
	
}
class Execute{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("\nenter the size of array: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for (int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int x:arr) {
			System.out.print(x+" ");
		}
		System.out.println("\nenter two integer: ");
		Nestedtry1 t=new Nestedtry1(sc.nextInt(),sc.nextInt(),arr);
		
	}
}
