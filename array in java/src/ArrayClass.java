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
		displaycontent(arr);
		

	}
	public static void displaycontent(int[] arr)
	{
		System.out.println("the array is displayed as: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nEnter 1 for reverse the array: \nEnter 2 for addition of array: \nEnter 3 sort the array: \nEnter 4 to find the length of array");
		int a=sc.nextInt();
		switch(a) {
		case 1:
			int[] b=reverse(arr);
			System.out.println("the reversed array is: ");
			for(int i=0;i<b.length;i++) {
				System.out.print(b[i]+" ");
			}
		case 2:
			addition(int[] arr);
		case 3: 
			sort(int[] arr);
		case 4:
			System.out.println("the lenght of array is: "+arr.length);
		}
	}
	
	public static int[] reverse(int[] arr) {
		int t,n=arr.length;
		for(int i=0;i<arr.length;i++) {
			t=arr[i];
			arr[i]=arr[n];
			arr[n]=t;
			n--;
		}
		return arr;
	}

}
