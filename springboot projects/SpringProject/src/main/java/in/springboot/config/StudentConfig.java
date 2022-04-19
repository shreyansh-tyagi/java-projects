package in.springboot.config;

import java.time.LocalDate;
import java.time.Month;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.springboot.student.Student;
import in.springboot.studentrepository.StudentRepository;

@Configuration
public class StudentConfig {

	@Bean
	CommandLineRunner commandlineRunner(StudentRepository repository) {
		return args->{
			Student shreyansh=new Student("shreyansh","shreytyagi@gmail.com",LocalDate.of(1999,Month.SEPTEMBER,2),23);
			Student akansha=new Student("akansha","akansha@gmail.com",LocalDate.of(2000,Month.DECEMBER,21),22);
			Student shruti=new Student("shruti","shruti123@gmail.com",LocalDate.of(1987,Month.AUGUST,3),33);
			Student shrey=new Student("shrey","shrey675@gmail.com",LocalDate.of(1990,Month.JUNE,5),29);
			Student rajeev=new Student("rajeev","rj1234@gmail.com",LocalDate.of(1989,Month.MAY,29),31);
			
		};
	}

}
