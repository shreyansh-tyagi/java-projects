import java.io.*;
import java.util.*;
public class ArrayRotation {
	public static void main(String args[]) {
		int arr[]= {1,2,3,4,5,6,7};
		int temp=0;
		for(int k=0;k<2;k++) {
			temp=arr[0];
		for(int i=0;i<arr.length-1;i++) {
			arr[i]=arr[i+1];		
			
		}
		arr[arr.length-1]=temp;
		}
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j]+" ");
		}
	}

}
