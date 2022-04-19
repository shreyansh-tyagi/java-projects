package in.springboot.studentrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.springboot.student.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student,Long>{
	

}
