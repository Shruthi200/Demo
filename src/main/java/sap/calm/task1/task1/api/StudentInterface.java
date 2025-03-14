package sap.calm.task1.task1.api;

import org.springframework.web.bind.annotation.*;
import sap.calm.task1.task1.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentInterface {

    @GetMapping()
    public List<Student> getAllStudents();

    @GetMapping("/id/{myid}")
    public Optional<Student> getStudentByID(@PathVariable("myid") long id);

    @PostMapping
    public void createStudent(@RequestBody Student student);

    @DeleteMapping("/id/{myid}")
    public void deleteStudentById(@PathVariable("myid") long id);

    @PutMapping("/id/{myid}")
    public void updateStudentById(@RequestBody Student student, long id);
}
