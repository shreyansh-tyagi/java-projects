package in.springboot.studentservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import in.springboot.student.Student;

@Service
public class StudentService {

	public List<Student> getstudentlist() {
		List<Student> list = new ArrayList<>();
		Student s = new Student();
		s.setid(1);
		s.setage(21);
		s.setname("shreyansh");
		s.setaddress("ghaziabad");
		list.add(s);

		s = new Student();
		s.setid(2);
		s.setage(23);
		s.setname("shivani");
		s.setaddress("gurugram");
		list.add(s);

		s = new Student();
		s.setid(3);
		s.setage(33);
		s.setname("shivam");
		s.setaddress("ghukna");
		list.add(s);

		return list;

	}

}
