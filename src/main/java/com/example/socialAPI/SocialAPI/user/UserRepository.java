package com.example.socialAPI.SocialAPI.user;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, String> {

    public List<User> findByLocationId(String locationId);

    public List<User>findByFirstName(String Firstname);
}
