package com.example.socialAPI.SocialAPI.students;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentsController {

    @Autowired
    private StudentsService studentService;

    @RequestMapping(value = "/students")
    public List<Students> getAllStudents(){
        return studentService.getAllStudents();

    }
    @RequestMapping(value = "/students/{id}")
    public Optional<Students> getStudents(@PathVariable String id){
        return studentService.getStudents(id);
    }

    @PostMapping(value = "/students/{id}")
    public void addStudents(@RequestBody Students students){
        studentService.addStudents(students);
    }

    @PutMapping(value = "/students/{id}")
    public void updateStudents(@RequestBody Students students, @PathVariable String id){
        studentService.updateStudents(id, students);
    }

    @DeleteMapping(value = "/students/{id}")
    public void deleteStudents(@PathVariable String id){
        studentService.deleteStudents(id);
    }
}
