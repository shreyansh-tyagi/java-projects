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
		return a1;
	}

}
