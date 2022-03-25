import java.util.*;
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
		addtolist(arr,arr1,ar2,arr3);
	}
	public static List<ArrayFunctionality> addtolist(ArrayFunctionality arr,ArrayFunctionality arr1,ArrayFunctionality ar2,ArrayFunctionality arr3){
		List<ArrayFunctionality> l=new ArrayList<ArrayFunctionality>();
		l.add(arr);
		l.add(arr1);
		l.add(ar2);
		l.add(arr3);
	}
}
