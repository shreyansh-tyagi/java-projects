import java.util.*;
public interface Reverse {
	void reversestring();

}
interface Evenodd {
	void reverseword();
}
class Logic implements Reverse,Evenodd{
	Scanner sc=new Scanner(System.in);
	public void reversestring() {
		System.out.println("enter the length of array: ");
		int a=sc.nextInt();		
		String s[]=new String[a];
		System.out.println("enter the string into the array: ");
		for(int i=0;i<a;i++) {
			s[i]=sc.nextLine();
		}
		System.out.println("entered string is: ");
		for(String c:s) {
			System.out.println(c);
		}
		String s1="";
		for(int i=0;i<s.length/2;i++) {
			s1=s[i];
			s[i]=s[s.length-i-1];
			s[s.length-i-1]=s1;
		}
		for(String c2:s) {
			System.out.println(c2);
		}
	}
	public void reverseword() {
		
	}
	public static void main(String args[]) {
		Logic l=new Logic();
		l.reversestring();
		l.reverseword();
	}
}



