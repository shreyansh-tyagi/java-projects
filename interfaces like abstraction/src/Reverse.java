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
		
	}
	public void reverseword() {
		
	}
}