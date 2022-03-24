import java.util.*;
public class ArrayListOperation {
	String name;int value;
	ArrayListOperation(String s,int v){
		this.name=s;
		this.value=v;
	}
	public List<String> getset(String s1,int v1){
		List<String> a=new ArrayList<String>();
		a.add(name);
		a.add(s1);
		a.add("string to array list manually");
		System.out.println("getting the element of getset method string: "+a.get(1));
		a.set(1, "index 1 is changed");
		List<Integer> a2=getset1(v1);
		a2.set(0,101);
		System.out.println("\nupdated array list is: ");
		for(Integer i:a2) {
			System.out.println(i);
		}
		return a;
	}
	public List<Integer> getset1(int v1){
		List<Integer> a1=new ArrayList<Integer>();
		a1.add(value);
		a1.add(v1);
		a1.add(72);
		List<Integer> re=reverse(a1,v1);
		System.out.println("reversed order list using collections reverse method: ");
		for(Integer e:re) {
			System.out.println(e);
		}
		return a1;
	}
	public List<Integer> reverse(List<Integer> a1,int v1){
		a1.add(v1);
		a1.add(31);
		a1.set(1,111);
		ListIterator<Integer> i=a1.listIterator(a1.size());
		System.out.println("reverse order list is: ");
		while(i.hasPrevious()) {
			System.out.println(i.previous());
		}
		
		Collections.reverse(a1);
		List<Integer> l= sorting(a1);
		System.out.println("sorted array is: ");
		l.forEach(a->{System.out.println(a);}); //lamda expression of print the element of arraylist
		return a1;
		
	}
	public List<Integer> sorting(List<Integer> a2){
		Collections.sort(a2);
		return a2;
		
	}

}
class Mainoperation extends ArrayListOperation{
	Mainoperation(String s,int v){
		super(s,v);
	}
	public static void main(String args[]) {
		ArrayListOperation arr=new ArrayListOperation("main String passed",121);
		List<String> s1= arr.getset("string passed from object",111);
		display(s1);
	}
	static void display(List<String> s1) {
		System.out.println("printing the array of string: ");
		s1.forEach(b->{System.out.println(b);});
		Collections.sort(s1);
		System.out.println("after sorting: ");
		s1.forEach(c->{System.out.println(c);});
		Collections.reverse(s1);
		System.out.println("after reversing: ");
		s1.forEach(d->{System.out.println(d);});
	}
}

