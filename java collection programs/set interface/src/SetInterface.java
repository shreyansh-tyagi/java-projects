import java.util.*;
public class SetInterface {
	String s;int n;
	SetInterface(String name,int value){
		this.s=name;
		this.n=value;
		
	}
	public Set<String> hashset(String s1){
		Set<String> set=new HashSet<String>();
		set.add(s1);
		set.add(s);
		set.add("string added");
		set.add("string added");
		return set;
	}
	public Set<Integer> hashsetint(int n1){
		Set<Integer> integer=new HashSet<Integer>();
		integer.add(n1);
		integer.add(n);
		integer.add(17);
		integer.add(17);
		integer.add(17);
		return integer;

	}
	public Set<String> linkedhashset(String s2){
		Set<String> linkedhashset1=new LinkedHashSet<String>();
		linkedhashset1.add(s2);
		linkedhashset1.add(s);
		linkedhashset1.add("string addede linked list");
		linkedhashset1.add("string addede linked list");
		return linkedhashset1;
		
	}
	public Set<Integer> linkedhashsetint(int n2){
		Set<Integer> linkedhashint=new LinkedHashSet<Integer>();
		linkedhashint.add(n2);
		linkedhashint.add(n);
		linkedhashint.add(177);
		linkedhashint.add(177); //it will not consider the duplicate value 
		linkedhashint.add(177); //it will not consider the order of the list as it is unordered set of elements
		
		return linkedhashint;
	}
	

}
class Mainhashset extends SetInterface{
	Mainhashset(String name,int value){
		super(name,value);
	}
	public static void main(String args[]) {
		SetInterface i=new SetInterface("shreyansh tyagi",109);
		Set<String> s=i.hashset("string given to hashset function");
		Set<Integer> s1=i.hashsetint(119);
		Set<String> s2=i.linkedhashset("string given to linked hash string");
		Set<Integer> s3=i.linkedhashsetint(121);
		Display d=new Display("display",911);
		d.displays(s,s1,s2,s3);
		
	}
}
class Display extends Mainhashset{

	Display(String name, int value) {
		super(name, value);
	}
	void displays(Set<String> s,Set<Integer> s1,Set<String> s2,Set<Integer> s3) {
		System.out.println("\ndisplaying the hashset string: \n");
		for(String a:s) {
			System.out.println(a);
			
		}
		System.out.println("\ndisplaying the hashset integer: \n");
		for(Integer a1:s1) {
			System.out.println(a1);
			
		}
		System.out.println("\ndisplaying the linkedhashset string: \n");
		for(String a2:s2) {
			System.out.println(a2);
			
		}
		System.out.println("\ndisplaying the linkedhashset integer: \n");
		for(Integer a3:s3) {
			System.out.println(a3);
			
		}
	}
	
	
}
