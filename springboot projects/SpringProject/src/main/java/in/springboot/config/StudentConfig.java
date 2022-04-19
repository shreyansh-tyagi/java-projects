package in.springboot.config;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.springboot.student.Student;
import in.springboot.studentrepository.StudentRepository;

@Configuration
public class StudentConfig {

	@Bean
	CommandLineRunner commandlineRunner(StudentRepository repository) {
		return args -> {
			Student shreyansh = new Student(1L,"shreyansh", "shreytyagi@gmail.com", LocalDate.of(1999, Month.SEPTEMBER,2));
			Student akansha = new Student(2L,"akansha", "akansha@gmail.com", LocalDate.of(2000, Month.DECEMBER, 21));
			Student shruti = new Student(3L,"shruti", "shruti123@gmail.com", LocalDate.of(1987, Month.AUGUST, 3));
			Student shrey = new Student(4L,"shrey", "shrey675@gmail.com", LocalDate.of(1990, Month.JUNE, 5));
			Student rajeev = new Student(5L,"rajeev", "rj1234@gmail.com", LocalDate.of(1989, Month.MAY, 29));

			repository.saveAll(List.of(shreyansh, akansha, shruti, shrey, rajeev));
		};
	}

}
