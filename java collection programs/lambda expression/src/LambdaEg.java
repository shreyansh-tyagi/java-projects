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
		
	}
	
}
