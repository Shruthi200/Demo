package sap.calm.task1.task1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import sap.calm.task1.task1.entity.Student;
import sap.calm.task1.task1.repository.StudentRepository;

import java.util.List;
import java.util.Optional;

@Component
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAllStudents(){
        return  studentRepository.findAll();
    }

    public Optional<Student> getStudentById(long id){
        return studentRepository.findById(id);
    }

    public void createStudent(Student student){
        studentRepository.save(student);
    }

    public void deleteStudentById(long id){
        studentRepository.deleteById(id);
    }

    public void updateStudentById(@RequestBody Student student, long id){
        if(studentRepository.existsById(id)) {
            student.setAdmissionNumber(id);
            studentRepository.save(student);
        }
    }


}
