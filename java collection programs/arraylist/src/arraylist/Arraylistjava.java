package arraylist;
import java.util.*;
public class Arraylistjava {
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		//System.out.println("enter the size of array list: ");
		//int n=sc.nextInt();
		List<String> l=new ArrayList<String>(); //created a array list of type string
		/*for(int i=0;i<n;i++) {
			System.out.println("enter the element into the arraylist: ");
			l.add(sc.next());
		}*/
		l.add("shrey tyagi");
		/*Iterator<String> it=l.iterator(); //1st way to print
		
		while(it.hasNext()) {
			System.out.println("\n"+it.next());
		}*/
		for(String e:l)//for each //2nd way to print
		{
			System.out.println(e);
		}
		sc.close();
		}

}