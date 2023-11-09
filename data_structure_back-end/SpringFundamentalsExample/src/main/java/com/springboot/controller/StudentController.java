package com.springboot.controller;

import java.util.*;
import com.springboot.beans.Student;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    public static List<Student> studentList = new ArrayList<Student>();

    // List of students
    public StudentController() {
        studentList.add(new Student("King", "George"));
        studentList.add(new Student("Juan", "Perez"));
        studentList.add(new Student("John", "Smith"));
        studentList.add(new Student("Michael", "Jordan"));

    }

    // GET (Obtain) HTTP Method
        // Show all students
            // http://localhost:8080/students
            @GetMapping("/students")
            public List<Student> getStudents() {
                return studentList;
            }

        // Request a specific student. It won't search from the existing values
            // http://localhost:8080/student/George/Washington
            @GetMapping("/student/{firstName}/{lastName}")
            public Student studentPathVariable(@PathVariable("firstName") String firstName, 
            @PathVariable("lastName") String lastName) {
                return new Student(firstName, lastName);
            }

        // Request a specific student. It will search from the existing values
            // http://localhost:8080/student/query?firstName=John&lastName=Smith
            @GetMapping("student/query")
            public Student studentQueryParam(@RequestParam(name="firstName") String firstName, 
            @RequestParam(name="lastName") String lastName) {
                return new Student(firstName, lastName);
        }

    // POST (Create) HTTP Method
        // By using postman, we send a request using http://localhost:8080/students endpoint
        @PostMapping("/students")
        public void addStudent(@RequestBody Student student) {
            studentList.add(student);
        }

    // PUT (Update) HTTP Method
        // It should use http://localhost:8080/student/{nameToUpdate}/{lastnameToUpdate}
        @PutMapping("/student/{firstName}/{lastName}")
        public void updateStudent(@PathVariable("firstName") String firstName,
        @PathVariable("lastName") String lastName, @RequestBody Student updateStudent) {
            for (Student student : studentList) {
                if(student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                    student.setFirstName(updateStudent.getFirstName());
                    student.setLastName(updateStudent.getLastName());
                }
                
            }
        }
    
    // DELETE HTTP Method
        // It should use http://localhost:8080/student/{nameToDelete}/{lastnameToDelete}
        @DeleteMapping("/student/{firstName}/{lastName}")
        public void deleteStudent(@PathVariable("firstName") String firstName, 
        @PathVariable("lastName") String lastName) {
            for (Student student : studentList) {
                if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                    studentList.remove(student);
                }
            }
        }
}

