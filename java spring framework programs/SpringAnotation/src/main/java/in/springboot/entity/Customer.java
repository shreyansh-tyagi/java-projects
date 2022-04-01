/**
 * 
 */
package in.springboot.entity;

/**
 * @author Admin
 *
 */
public class Customer {
	private int id, age;
	String name, location;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
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
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", age=" + age + ", name=" + name + ", location=" + location + "]";
	}

}
