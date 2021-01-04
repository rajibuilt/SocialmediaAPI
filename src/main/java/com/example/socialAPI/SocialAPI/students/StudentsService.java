package com.example.socialAPI.SocialAPI.students;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentsService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Students> getAllStudents(){
        List<Students> students = new ArrayList<>();

        studentRepository.findAll()
        .forEach(students::add);

        return students;
    }

    public void addStudents (Students students){
        studentRepository.save(students);
    }

    public Optional<Students> getStudents(String id){
        return studentRepository.findById(id);
    }

    public void updateStudents(String id, Students students){
        studentRepository.save(students);
    }

    public void deleteStudents(String id){
        studentRepository.deleteById(id);
    }


}

