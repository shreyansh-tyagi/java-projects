package in.springboot.user;

public class User {
	int id;
	String name;
	User(int id ,String name){
		this.id=id;
		this.name=name;
	}
	 public int getid() {
		 return id;
	 }
	 public void setid(int id) {
		 this.id=id;
	 }
	 public String name() {
		 return name;
	 }
	 public void setname(String name) {
		 this.name=name;
	 }
	 public String toString() {
		 return ("id: "+id+"name: "+name);
	 }
	

}
