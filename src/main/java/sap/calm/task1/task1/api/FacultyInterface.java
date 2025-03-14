package sap.calm.task1.task1.api;

import org.springframework.web.bind.annotation.*;
import sap.calm.task1.task1.entity.Faculty;

import java.util.List;
import java.util.Optional;

public interface FacultyInterface
{
    @GetMapping()
    public List<Faculty> getAllFaculties();

    @GetMapping("/id/{myid}")
    public Optional<Faculty> getFacultyByID(@PathVariable("myid") long id);

    @PostMapping
    public void createFaculty(@RequestBody Faculty faculty);

    @DeleteMapping("/id/{myid}")
    public void deleteFacultyById(@PathVariable("myid") long id);

    @PutMapping("/id/{myid}")
    public void updateFacultyById(@RequestBody Faculty faculty,@PathVariable("myid") long id);
}
