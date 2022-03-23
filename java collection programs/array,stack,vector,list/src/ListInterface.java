import java.util.*;
public class ListInterface {
	public List<String> array(String s) {
		List<String> l=new ArrayList<String>();
		l.add(s);
		return l;
	}
	public static List<String> linkedlist(List<String> l,String s){
		List<String> l1=new LinkedList<String>();
		l1.add(s);
		return l1;
	}

}
class MainArray extends ListInterface{

	public static void main(String args[]) {
		ListInterface i=new ListInterface();
		List<String> s=i.array("shrey tyagi");
		List<String> s1=linkedlist(s,"sunny");
	}
}