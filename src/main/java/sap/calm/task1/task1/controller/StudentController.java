package sap.calm.task1.task1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sap.calm.task1.task1.api.StudentInterface;
import sap.calm.task1.task1.entity.Student;
import sap.calm.task1.task1.service.StudentService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController implements StudentInterface {

    @Autowired
    StudentService studentService;


    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }


    public Optional<Student> getStudentByID(@PathVariable("myid") long id){
        return studentService.getStudentById(id);
    }


    public void createStudent(@RequestBody Student student){
        studentService.createStudent(student);
    }


    public void deleteStudentById(@PathVariable("myid") long id){
        studentService.deleteStudentById(id);
    }


    public void updateStudentById(@RequestBody Student student,@PathVariable("myid") long id){
        studentService.updateStudentById(student,id);
    }
}
