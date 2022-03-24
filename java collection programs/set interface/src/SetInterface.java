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
		return set;
	}
	public Set<Integer> hashsetint(int n1){
		Set<Integer> integer=new HashSet<Integer>();
		 
		
	}
	

}
