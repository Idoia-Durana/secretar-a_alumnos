

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.secretar-a_alumnosApplication;
import org.springframework.boot.autoconfigure.secretar-a_alumnosApplication;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@SpringBootApplication
public class secretar-a_alumnosApplication implements CommandLineRunner {

	public static void main(String[] args) {
		secretar-a_alumnosApplication.run(secretar-a_alumnosApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {

	/*
	 *	Student estudiante1 = new Student ("Diego","gómez","Dg@gmail.com");
	*	studentRepository.save(estudiante1);
	 	
	 *	Student estudiante2 = new Student ("Mario","Vargas","mvargas@gmail.com");
	 *	studentRepository.save(estudiante2);
	 
	 *	Student estudiante3 = new Student ("Jesús","Ramírez","Jesúsram@gmail.com");
	 *	studentRepository.save(estudiante3);
	 */
	}

}
