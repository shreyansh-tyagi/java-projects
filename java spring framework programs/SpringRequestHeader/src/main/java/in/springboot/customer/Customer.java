package in.springboot.customer;

public class Customer {
	private String name,location;
	int age;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}


	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	public Customer(String name, String location, int age) {
		super();
		this.name = name;
		this.location = location;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", location=" + location + ", age=" + age + "]";
	}

}
