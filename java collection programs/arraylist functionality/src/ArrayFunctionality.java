import java.util.*;
import java.lang.*;
public class ArrayFunctionality {
	String name,gender;
	int age;
	float salary;
	
	ArrayFunctionality(String n,String g,int a,float s){
		this.name=n;
		this.gender=g;
		this.age=a;
		this.salary=s;
	}

}
class MainArray{
	public static void main(String args[]) {
		ArrayFunctionality arr=new ArrayFunctionality("shrey","male",23,37500);
		ArrayFunctionality arr1=new ArrayFunctionality("shreyansh tyagi","male",24,67500);
		ArrayFunctionality ar2=new ArrayFunctionality("shivani","female",25,30000);
		ArrayFunctionality arr3=new ArrayFunctionality("shalu","female",23,39000);
		List<ArrayFunctionality> l=addtolist(arr,arr1,ar2,arr3);
		System.out.println("printing the array functionality");
		l.forEach(a->{System.out.println("name-> "+a.name+"gender-> "+a.gender+"age-> "+a.age+"salary-> "+a.salary);});
		addelement(l);
	}
	public static List<ArrayFunctionality> addtolist(ArrayFunctionality arr,ArrayFunctionality arr1,ArrayFunctionality ar2,ArrayFunctionality arr3){
		List<ArrayFunctionality> l=new ArrayList<ArrayFunctionality>();
		l.add(arr);
		l.add(arr1);
		l.add(ar2);
		l.add(arr3);
		return l;
	}
	public static List<ArrayFunctionality> addelement(List<ArrayFunctionality> l){
		List<String> l1=new ArrayList<String>();
		l1.add("ravi");
		l1.add("sonu");
		System.out.println("l2 list now: "+l1);
		l1.add(1, "shrey at index 1");
		
	   
		
	}
}
