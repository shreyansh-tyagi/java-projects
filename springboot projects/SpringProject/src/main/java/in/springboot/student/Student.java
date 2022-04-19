package in.springboot.student;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table
public class Student {
	
	@Id
	@SequenceGenerator(
			name="springboot_sequence",
			sequenceName="springboot_sequence",
			allocationSize=1
			
			)
	
	@GeneratedValue(
			strategy=GenerationType.SEQUENCE,
			generator="springboot_sequence"    
			)
	
	private Long id;
	private String name, email;
	private LocalDate dob;
	private int age;

	public Student() {
		super();
	}

	public Student(long id, String name, String email, LocalDate dob, int age) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.age = age;
	}

	public Student(String name, String email, LocalDate dob, int age) {
		super();
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.age = age;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", dob=" + dob + ", age=" + age + "]";
	}

}
