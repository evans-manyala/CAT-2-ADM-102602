package com.example.demo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import sun.tools.jar.CommandLine;

import java.util.List;

@Component
public class StudentRegistrationPortal implements CommandLineRunner {
    @Override
    public  void run(String...args)throws Exception{
        RestTemplate restTemplate=new RestTemplate();

        ResponseEntity<List<Student>>response=restTemplate.exchange(
                "http://10.51.10.111:1000/registrations",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Student>>(){});
        for(Student student:students){
            System.out.println(student.toString());
        }
        System.out.println("Student Details");
        Student student=restTemplate.getForObject(
                "http://10.51.10.111:1000/registrations",
                Student.class);
        System.out.println(student.toString());

        System.out.println("Creating(POSTING STUDENT DETAILS)----------------------------");

        Student newStudent=new Student(100,12,"Evans",10,"NULL",);
        Student createdStudent=restTemplate.postForObject("http://10.51.10.111:1000/registrations",newStudent, student.getClass());
        System.out.println(createdStudent.toString());

    }
}
