package com.java.main.Spring.Project.service;

import com.java.main.Spring.Project.entities.Address;
import com.java.main.Spring.Project.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {


    public Student showData(){
        Address address = new Address(1,"Pokhara","nayabazar","nepal");
        Student student = new Student(1,"krishna",3200,address);
        return student;
    }
}
