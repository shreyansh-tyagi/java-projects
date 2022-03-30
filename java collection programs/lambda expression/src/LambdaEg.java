import java.util.*;
import java.util.stream.Stream;
public class LambdaEg {
	int id,age,salary;
	String name,gender;
	LambdaEg(int id,int age,int salary,String name,String gender){
		this.id=id;
		this.age=age;
		this.salary=salary;
		this.name=name;
		this.gender=gender;
	}
	public void setid(int id) {
		this.id=id;
	}
	public int getid() {
		return id;
	}

}
class MainLambda{
	public static void main(String args[]) {
		List<LambdaEg> list=new ArrayList();
		list.add(new LambdaEg(11,21,32000,"shrey","male"));
		list.add(new LambdaEg(9,23,62000,"shiva","male"));
		list.add(new LambdaEg(31,32,52000,"aryan","male"));
		list.add(new LambdaEg(21,34,72000,"asshi","female"));
		
		Collections.sort(list,(e1,e2)->{return e1.name.compareTo(e2.name);}); //we can use compare to method with string only 
		System.out.println("sorting with name: ");
		list.forEach(a->System.out.println("id: "+a.id+" age: "+a.age+" salary: "+a.salary+" name: "+a.name+" gender: "+a.gender));
		
		Comparator<LambdaEg> l=Comparator.comparing(LambdaEg::getid); //its not possible to use the compare to method with string
		// we need to create the get and set method for the element with whom we want to sort 
		Collections.sort(list,l); 
		System.out.println("\n\nsorting with id: ");
		list.forEach(a->System.out.println("id: "+a.id+" age: "+a.age+" salary: "+a.salary+" name: "+a.name+" gender: "+a.gender));
		
		Stream<LambdaEg> st=list.stream().filter(a->a.salary>60000);
		st.forEach(a->System.out.println("name: "+a.name+" salary: "+a.salary));
	}
	
}
