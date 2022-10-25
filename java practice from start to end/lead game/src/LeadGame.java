/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* Name of the class has to be "Main" only if the class is public. */
class LeadGame
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int sum=0,sum1=0,i,j,k;
		List<Integer> list=new ArrayList<>();
		List<Integer> list1=new ArrayList<>();
		List<Integer> l1=new ArrayList<>();
		List<Integer> l2=new ArrayList<>();
		for(i=0;i<a;i++){
		    list.add(sc.nextInt());
		    list1.add(sc.nextInt());
		}
		for(j=0;j<a;j++){
		    sum+=list.get(j);
		    list.set(j,sum);
		    sum1+=list1.get(j);
		    list1.set(j,sum1);
		}
		for(k=0;k<a;k++){
		    if(list.get(k)>list1.get(k)){
		        l1.add(list.get(k)-list1.get(k));
		    }
		    else{
		        l2.add(list1.get(k)-list.get(k));
		    }
		}
		
		int x=Collections.max(l1);
		int y=Collections.max(l2);
		if(x>y) {
			System.out.println("1 "+x);
		}
		else {
			System.out.println("1 "+y);
		}
	}
}
