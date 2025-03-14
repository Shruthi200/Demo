package sap.calm.task1.task1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sap.calm.task1.task1.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

}
