package com.java.main.Spring.Project;

import com.java.main.Spring.Project.entities.Student;
import com.java.main.Spring.Project.service.StudentService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringProjectApplicationTests {
	@Autowired
	StudentService studentService;
	@Test
	public void contextLoads() {
	}
	@Test
	public void testStudent() throws Exception{
		Student student = studentService.showData();
		Assert.assertNotNull(student);
	}

}
