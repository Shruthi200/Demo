package sap.calm.task1.task1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import sap.calm.task1.task1.entity.Faculty;
import sap.calm.task1.task1.entity.Student;
import sap.calm.task1.task1.repository.FacultyRepository;
import sap.calm.task1.task1.repository.StudentRepository;

import java.util.List;
import java.util.Optional;

@Component
public class FacultyService {

    @Autowired
    FacultyRepository facultyRepository;

    public List<Faculty> getAllFaculties(){
        return  facultyRepository.findAll();
    }

    public Optional<Faculty> getFacultyById(long id){
        return facultyRepository.findById(id);
    }

    public void createFaculty(Faculty faculty){
        facultyRepository.save(faculty);
    }

    public void deleteFacultyById(long id){
        facultyRepository.deleteById(id);
    }

    public void updateFacultyById(@RequestBody Faculty faculty, long id){
        if(facultyRepository.existsById(id)) {
            faculty.setEmployeeId(id);
            facultyRepository.save(faculty);
        }
    }


}
