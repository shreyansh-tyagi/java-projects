import java.util.*;
public interface Reverse {
	void reversestring(); //by default abstract method

}
interface Evenodd {
	void reverseword();
}
class Logic implements Reverse,Evenodd{ //defining the abstract method by implementing interface
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();	
	String s[]=new String[a+1];
	public void reversestring() {
		
		System.out.println("enter the string into the array: ");
		for(int i=0;i<a+1;i++) {
			s[i]=sc.nextLine();
		}
		System.out.println("\n\nentered string is: ");
		for(String c:s) {
			System.out.print(c+" ");
		}
		String s1="";
		for(int i=0;i<s.length/2;i++) {
			s1=s[i];
			s[i]=s[s.length-i-1];
			s[s.length-i-1]=s1;
		}
		System.out.println("\n\nreversed array of  string is:");
		for(String c2:s) {
			System.out.print(c2+" ");
		}
	}
	public void reverseword() {
		System.out.println("\n\nchoose the index from array which you want to reverse: ");
		int b=sc.nextInt();
		String x="";
		char y;
		for(int i=0;i<s[b-1].length();i++) {
			y=s[b-1].charAt(i);
			x=y+x;
		}
		System.out.println("\n\nreversed selected word is: \n"+x);
		s[b-1]=x;
		System.out.println("\n\nupdated array of string is: ");
		for(String c2:s) {
			System.out.print(c2+" ");
		}
		
	}
	public static void main(String args[]) {
		System.out.println("enter the length of array: ");
		Logic l=new Logic();
		l.reversestring();
		l.reverseword();
	}
}



