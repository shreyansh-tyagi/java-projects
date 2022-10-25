import java.io.*;
import java.util.*;
public class Minmax {
	public static void main(String args[])
	{
		String s="aabbeebbcdccacdcfc";
		int max=0,min=999;
		char s1=' ',s2=' ';
		for(int i=0;i<s.length();i++) {
			int count=0;
			for(int j=0;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					count+=1;
				}
			}
			if(max<count) {
				max=count;
				s1=s.charAt(i);
			}
			else if(min>count) {
				min=count;
				s2=s.charAt(i);
				
			}
			
		}
		System.out.println("maximum occurence is: "+s1);
		System.out.println("minimum occurence is: "+s2);
	}
}
