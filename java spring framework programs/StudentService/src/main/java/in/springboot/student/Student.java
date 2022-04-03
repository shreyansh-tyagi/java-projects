package in.springboot.student;

public class Student {
	int id,age;
	String name,address;
	
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id=id;
	}
	public int getage() {
		return age ;
	
	}
	public void setage(int age ) {
		this.age=age;
		
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
	public String getaddress() {
		return address;
	}
	public void setaddress(String address) {
		this.address=address;
	}
	@Override
	public String toString() {
		return ("ID: "+id+"\nAge: "+age+"\nName: "+name+"\nAddress: "+address);
	}
	

}
