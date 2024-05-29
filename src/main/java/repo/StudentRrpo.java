package repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asterisc.in.pack.model.Student;

public interface StudentRrpo extends JpaRepository<Student, Integer>{

}
