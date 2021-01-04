package com.example.socialAPI.SocialAPI.students;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface StudentRepository extends CrudRepository<Students, String> {

}
