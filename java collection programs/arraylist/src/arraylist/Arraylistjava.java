package arraylist;
import java.util.*;
public class Arraylistjava {
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the size of array list: ");
		int n=sc.nextInt();
		ArrayList<String> l=new ArrayList<String>(); //created a array list of type string
		for(int i=0;i<n;i++) {
			System.out.println("enter the element into the arraylist: ");
			l.add(sc.next());
		}
		Iterator<String> it=l.iterator();
		while(it.hasNext()) {
			System.out.println("\n"+it.next());
		}
		sc.close();
		}

}