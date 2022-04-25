package in.springboot.service;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.springboot.student.Student;
import in.springboot.studentrepository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;

	public List<Student> getlist() {
		List<Student> student = new ArrayList<>();
		student.add(new Student(1L, "shreyansh", "shreytyagi@gmail.com", LocalDate.of(1999, Month.SEPTEMBER, 2)));
		student.add(new Student(2L, "akansha", "akansha@gmail.com", LocalDate.of(2000, Month.DECEMBER, 21)));
		student.add(new Student(3L, "shruti", "shruti123@gmail.com", LocalDate.of(1987, Month.AUGUST, 3)));
		student.add(new Student(4L, "shrey", "shrey675@gmail.com", LocalDate.of(1990, Month.JUNE, 5)));
		student.add(new Student(5L, "rajeev", "rj1234@gmail.com", LocalDate.of(1989, Month.MAY, 29)));
		return student;
	}

	public void addNewStudent(Student student) {

		Optional<Student> studentOptional = studentRepository.findStudentByEmail(student.getEmail());
		if (studentOptional.isPresent()) {
			throw new IllegalStateException("email taken");
		}
		studentRepository.save(student);

		System.out.println(student);

	}

	public void deleteStudent(Long studentId) {
		boolean exists = studentRepository.existsById(studentId);
		if (!exists) {
			throw new IllegalStateException("student with " + studentId + " does not exists");
		}
		studentRepository.deleteById(studentId);

	}

	@Transactional
	public void updateStudent(Long studentId, String name, String email) {
		Student student = studentRepository.findById(studentId)
				.orElseThrow(() -> new IllegalStateException("student with id " + studentId + " does not exsits"));

		if (name != null && name.length() > 0 && !Objects.equals(student.getName(), name)) {
			student.setName(name);
		}
		
		if(email!=null && name.length()>0 && !Objects.equals(student.getEmail(), email)) {
			student.setEmail(email);
		}
		
	}

}
