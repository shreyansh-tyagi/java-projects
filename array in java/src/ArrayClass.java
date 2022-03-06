import java.util.Scanner;

public class ArrayClass {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the size of array: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int i;
		System.out.println("enter the elements into the array: ");
		for(i=0;i<n;i++);
		{
			arr[i]=sc.nextInt();
		}
		displaycontent();
		

	}
	public static void displaycontent();
	{
		System.out.println("Enter 1 for reverse the array: \nEnter 2 for addition of array: \nEnter 3 sort the array: \nEnter 4 to find the length of array");
		
	}

}
