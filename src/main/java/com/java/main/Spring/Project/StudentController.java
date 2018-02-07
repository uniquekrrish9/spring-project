package com.java.main.Spring.Project;

import com.java.main.Spring.Project.entities.Student;
import com.java.main.Spring.Project.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController("/student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Student> showStudentData(){
        Student student=studentService.showData();
        return ResponseEntity.ok(student);
    }
}