import java.util.*;
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

}
class MainLambda{
	public static void main(String args[]) {
		List<LambdaEg> list=new ArrayList();
		list.add(new LambdaEg(11,21,32000,"shrey","male"));
		list.add(new LambdaEg(9,23,62000,"shiva","male"));
		list.add(new LambdaEg(31,32,52000,"aryan","male"));
		list.add(new LambdaEg(21,34,72000,"asshi","female"));
		
		Collections.sort(list,(e1,e2)->{return e1.name.compareTo(e2.name);});
		System.out.println("sorting with name: ");
		list.forEach(a->System.out.println("id: "+a.id+" age: "+a.age+" salary: "+a.salary+" name: "+a.name+" gender: "+a.gender));
	}
	
}
