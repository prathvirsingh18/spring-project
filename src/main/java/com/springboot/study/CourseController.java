package com.springboot.study;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    @RequestMapping("/courses")
    public List<Course> retriveAllCourse(){
        return Arrays.asList(
                new Course(1, "Learn Aws", "By Prathvi"),
                new Course(4, "Learn Sql", "By Prathvi"),
                new Course(5, "Learn Django", "By Prathvi"),
                new Course(6, "Learn Scala", "By Prathvi"),
                new Course(7, "Learn la", "By Prathvi"),
                new Course(8, "Learn la", "By Prathvi")
        );
    }
}
