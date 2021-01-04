package com.example.socialAPI.SocialAPI.students;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Students {


    @Id
    private String id;
    private String name;
    private String department;

    public Students(String id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public Students() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
