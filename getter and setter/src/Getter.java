import java.util.*;
public class Getter {

	private String name;
	private int id;
	public void setname(String name) {
		this.name=name;
	}
	public String getname() {
		return name;
	}
	public void setid(int id) {
		this.id=id;
	}
	public int getid() {
		return id;
	}
}
class Mainegtter{ //encapsulated class because it wrap the getter,setter method and private member of class getter
	public static void main(String args[]) {
		Getter g=new Getter();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name: ");
		g.setname(sc.nextLine());
		System.out.println("your name is: "+g.getname());
		System.out.println("enter the id : ");
		g.setid(sc.nextInt());
		System.out.println("your id is: "+g.getid());
		sc.close();
	}
}
