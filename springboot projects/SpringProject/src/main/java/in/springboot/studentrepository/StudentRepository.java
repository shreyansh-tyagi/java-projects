package in.springboot.studentrepository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import in.springboot.student.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

	//@Query("select s from Student where s.email=?1")
	Optional<Student> findStudentByEmail(String email);

}
