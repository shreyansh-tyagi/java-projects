import java.util.*;
public class ListInterface {
	public List<String> array(String s) {
		List<String> l=new ArrayList<String>();
		l.add(s);
		return l;
	}
	public static List<String> linkedlist(List<String> l,String s){
		List<String> l1=new LinkedList<String>();
		l.add(s); //arraylist
		l1.add(s); //linked lsit
		System.out.println("\n\nlinked list: ");
		for(String a:l1) {
			System.out.println(a);
		}
		return l1; //returning linkedlist
	}
	public static List<String> vector(List<String> l,String s){
		List<String> l2=new Vector<String>();
		l2.add(s); //vector
		l.add(s); //arraylist
		System.out.println("\n\nvector: ");
		for(String s1:l2) {
			System.out.println(s1);
		}
		return l2; //returning vector
	}
	public static List<String> stack(List<String> l1,String s){
		List<String> l3=new Stack<String>(); 
		l1.add(s); //linked list
		((Stack<String>)l3).push(s); //stack
		System.out.println("\n\nstack: ");
		for(String a:l3) {
			System.out.println(a);
		}
		return l3; //returning stack
		
	}

}
class MainArray extends ListInterface{

	public static void main(String args[]) {
		ListInterface i=new ListInterface();
		List<String> s=i.array("shrey tyagi");
		List<String> s1=linkedlist(s,"sunny");
		List<String> s2=vector(s,"rajesh");
		List<String> s3=stack(s1,"linkedlist reference");
		System.out.println("\n\narray list: ");
		for(String a:s2) {
			System.out.println(a);
		}
		System.out.println("\n\nupdated linked list: ");
		for(String b:s3) {
			System.out.println(b);
		}
	}
}