
/*
 Sometimes it's better to use dynamic size arrays. Java's Arraylist can provide you this feature. Try to solve this problem using Arraylist.

You are given  lines. In each line there are zero or more integers. You need to answer a few queries where you need to tell the number located in  position of  line.

Take your input from System.in.

Input Format
The first line has an integer . In each of the next  lines there will be an integer  denoting number of integers on that line and then there will be  space-separated integers. In the next line there will be an integer  denoting number of queries. Each query will consist of two integers  and .

Constraints

Each number will fit in signed integer.
Total number of integers in  lines will not cross .

Output Format
In each line, output the number located in  position of  line. If there is no such position, just print "ERROR!"

Sample Input

5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5
Sample Output

74
52
37
ERROR!
ERROR!
Explanation

The diagram below explains the queries:

image
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.*;
public class Listofarray {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of iteration:");
		int a = sc.nextInt();
		//int arr1[] = new int[100];
		//int arr2[][]=new int[100][100];
		 List<ArrayList> arr = new ArrayList<ArrayList>();
         
		for (int x = 0; x <a; x++) {
			ArrayList<Integer> arr1=new ArrayList<Integer>();
			System.out.println("enter the size of array: ");
			int b = sc.nextInt();
			for (int i = 0; i < b; i++) {
				System.out.println("enter the element into the array: ");
				arr1.add(i,sc.nextInt());

			}
			arr.add(arr1);
			
			

		}
		System.out.println(arr);
		query(arr);
		

	}
	/*public static ArrayList<Integer> clr(ArrayList<Integer> arr1) {
		arr1.clear();
		return arr1;
		
	}*/

	public static void query(List<ArrayList> arr) {
			System.out.println("enter the number of queries: ");
			Scanner sc = new Scanner(System.in);
			int c=sc.nextInt();
			
			for(int i=0;i<c;i++) {
				System.out.println("enter to select the  array: ");
		        int a=sc.nextInt();
		        System.out.println("enter the index of the  array: ");
		        int b=sc.nextInt();
		        ArrayList<Integer> arr1=new ArrayList<Integer>();
		        arr1=arr.get(a-1);
		        if (arr1.size()>=b){
		        	System.out.println(arr1.get(b-1));
		        	
		        }
		        else {
		        	System.out.println("ERROR");
		        	
		        }
		       
			}
		
		}
}
