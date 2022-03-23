import java.util.*;
public class ListInterface {
	public List<String> array(String s) {
		List<String> l=new ArrayList<String>();
		l.add(s);
		return l;
	}
	public static List<String> linkedlist(List<String> l,String s){
		List<String> l1=new LinkedList<String>();
		l.add(s);
		l1.add(s);
		for(String a:l1) {
			System.out.println(a);
		}
		return l;
	}
	public static List<String> vector(List<String> l,String s){
		List<String> l2=new Vector<String>();
		l2.add(s);
		l.add(s);
		for(String s1:l2) {
			System.out.println(s1);
		}
		return l;
	}
	public static List<String> stack(List<String> l1,String s){
		List<String> l3=new Stack<String>(); 
		l1.add(s);
		((Stack<String>)l3).push(s);
		for(String a:l3) {
			System.out.println(a);
		}
		return l1;
		
	}

}
class MainArray extends ListInterface{

	public static void main(String args[]) {
		ListInterface i=new ListInterface();
		List<String> s=i.array("shrey tyagi");
		List<String> s1=linkedlist(s,"sunny");
		List<String> s2=vector(s,"rajesh");
	}
}