import java.util.*;
//import java.lang.*;
import java.io.*;
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
		l.forEach(a->{System.out.println("name-> "+a.name+" gender-> "+a.gender+" age-> "+a.age+" salary-> "+a.salary);});
		List<String> lis2=addelement();
		System.out.println("let see the element of list 2: "+lis2);
		List<String> lis3=retainelement(lis2);
		System.out.println("after retaining the element: "+lis3);
		serialization(l);
		List<String> linkedlist=linkedlist(lis2);
		List<String> linkedre=linkedremove(linkedlist);
		displaycontent(linkedlist,linkedre);
	}
	public static void displaycontent (List<String> linkedlist,List<String> linkedre){
		linkedlist.forEach(a->{System.out.print(a);});
		linkedre.forEach(b->{System.out.print(b);});
		
		
	}
	public static List<String> linkedremove(List<String> re){
		re.remove(0);
		((LinkedList<String>) re).removeFirst();
		((LinkedList<String>) re).removeLast();
		((LinkedList<String>) re).removeFirstOccurrence("shiva");
		((LinkedList<String>) re).removeLastOccurrence("hello");
		return re;
	}
	public static List<String> linkedlist(List<String> lis2){
		List<String> l=new LinkedList<String>();
		l.addAll(lis2);
		l.add(0,"matt added into linked list");
		((LinkedList<String>) l).addFirst("firstly");
		((LinkedList<String>) l).addLast("lastly");
		List<String> l1=new LinkedList<String>();
		l1.add("shrey");
		l1.add("hello");
		l.addAll(1, l1);
		return l;
	}
	public static void serialization(List<ArrayFunctionality> l) {
		try {
			//serialization
			FileOutputStream f=new FileOutputStream("file"); //creating the output stream
			ObjectOutputStream o=new ObjectOutputStream(f); //creating the object of output stream
			o.writeObject(l); //writing the data inside the file
			f.close();
			o.close();
			//deserialization
			FileInputStream i=new FileInputStream("file"); //creating the input stream
			ObjectInputStream o1=new ObjectInputStream(i); //creating the object of input stream
			ArrayFunctionality a=(ArrayFunctionality)o1.readObject(); //as the data is of type arrayfunctionality type therefore creating the variable of same type
			System.out.println(a);
			o1.close();
			i.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public static List<ArrayFunctionality> addtolist(ArrayFunctionality arr,ArrayFunctionality arr1,ArrayFunctionality ar2,ArrayFunctionality arr3){
		List<ArrayFunctionality> l=new ArrayList<ArrayFunctionality>();
		l.add(arr);
		l.add(arr1);
		l.add(ar2);
		l.add(arr3);
		return l;
	}
	public static List<String> addelement(){
		List<String> l1=new ArrayList<String>();
		l1.add("ravi");
		l1.add("sonu");
		System.out.println("l2 list now: "+l1);
		l1.add(1, "shrey at index 1");
		List<String> l2=new ArrayList<String>();
		l2.add("shiva");
		l2.add(1,"shalu");
		l1.addAll(l2); //added whole l2 list inside l1
		l1.addAll(0,l2); //added whole l2 list inside l1 at index 0
		System.out.println("updatded list is: "+l1);
		List<String> lis1=removeelement(l1,l2);
		System.out.println("is the list is empty: "+lis1.isEmpty());
		return l2;
		
	   
		
	}
	public static List<String> removeelement(List<String> l1,List<String> l2){
		l1.remove("ravi");
		l1.remove(0);
		l1.add(0,"shanu");
		l1.removeAll(l2);
		System.out.println("list after the element has been removed: "+l1);
		l1.removeIf(str->str.contains("shiva"));
		System.out.println("updated list after removing the element: "+l1);
		l1.clear();
		System.out.println("after clearing the list is: "+l1);
		return l1;
		
		
	}
	public static List<String> retainelement(List<String> l2){
		List<String> l3=new ArrayList<String>();
		l3.add("shalu");
		l3.add("ravi");
		l2.retainAll(l3);
		l2.forEach(a->{System.out.println(a);});
		return l2;
		
	}
}
