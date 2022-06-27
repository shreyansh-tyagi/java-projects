//import java.io.*;
import java.util.*;
public class hackerrank {

	    public static void main(String[] args) {
	        
	        Scanner sc=new Scanner(System.in);
	        System.out.println("enter two string the value of A and B: ");
	        String A=sc.next();
	        String B=sc.next();
	        /* Enter your code here. Print output to STDOUT. */
	        int c=A.length()+B.length();
	        System.out.println(c);
	        String d[]=new String[2];
	        d[0]=A;
	        d[1]=B;
	        Arrays.sort(d,String.CASE_INSENSITIVE_ORDER);
	        if(d[0]==A)
	        System.out.println("No");
	        else
	        System.out.println("Yes");
	        String e=A.substring(0,1).toUpperCase()+A.substring(1,A.length())+" "+ B.substring(0,1).toUpperCase()+B.substring(1,B.length());
	        System.out.println(e);
	        
	        
	        
	        
	        
	    }
	}


