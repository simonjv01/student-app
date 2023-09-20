package net.javaguides.studentapp.repository;

import net.javaguides.studentapp.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    List<Student> findAllBySchoolId(Integer schoolId);


}
