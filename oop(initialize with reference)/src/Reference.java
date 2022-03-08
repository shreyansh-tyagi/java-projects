import java.util.*;
import java.io.*;
public class Reference {
	String s;
	int a;
}
class Reference1{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		Reference r=new Reference();
		r.s=sc.nextLine();
		r.a=sc.nextInt();
	}
}
