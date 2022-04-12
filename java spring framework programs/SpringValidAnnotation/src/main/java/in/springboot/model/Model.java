package in.springboot.model;

import javax.validation.constraints.NotNull;

public class Model {
	
	@NotNull
	private String name;
	@NotNull(message="location should not be null shreyansh") //this message will be shown on the default message while the error will occured
	private String location;
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
		return "Model [name=" + name + ", location=" + location + "]";
	}
	
	

}
