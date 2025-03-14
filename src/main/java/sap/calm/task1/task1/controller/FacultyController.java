package sap.calm.task1.task1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sap.calm.task1.task1.api.FacultyInterface;
import sap.calm.task1.task1.entity.Faculty;
import sap.calm.task1.task1.entity.Student;
import sap.calm.task1.task1.service.FacultyService;
import sap.calm.task1.task1.service.StudentService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/faculty")
public class FacultyController implements FacultyInterface {

    @Autowired
    FacultyService facultyService;


    public List<Faculty> getAllFaculties(){
        return facultyService.getAllFaculties();
    }


    public Optional<Faculty> getFacultyByID(@PathVariable("myid") long id){
        return facultyService.getFacultyById(id);
    }


    public void createFaculty(@RequestBody Faculty faculty){
        facultyService.createFaculty(faculty);
    }


    public void deleteFacultyById(@PathVariable("myid") long id){
        facultyService.deleteFacultyById(id);
    }


    public void updateFacultyById(@RequestBody Faculty faculty,@PathVariable("myid") long id){
        facultyService.updateFacultyById(faculty,id);
    }
}
