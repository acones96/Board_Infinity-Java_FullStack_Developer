package com.springboot.controller;

import java.util.*;
import com.springboot.beans.Teacher;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {

    public static List<Teacher> teacherList = new ArrayList<Teacher>();

    // List of teachers
    public TeacherController() {
        teacherList.add(new Teacher("Jorge", "Ramirez"));
        teacherList.add(new Teacher("Juan", "Perez"));
        teacherList.add(new Teacher("Sebastian", "Alvarez"));
        teacherList.add(new Teacher("Diego", "Garcia"));
    }

    // GET (Obtain) HTTP Method
        // Show all teachers
            // http://localhost:8080/teachers
            @GetMapping("/teachers")
            public List<Teacher> getTeachers() {
                return teacherList;
            }

        // Request a specific teacher. It won't search from the existing values
            // http://localhost:8080/teacher/George/Washington
            @GetMapping("/teacher/{firstName}/{lastName}")
            public Teacher profesorPathVariable(@PathVariable("firstName") String firstName, 
            @PathVariable("lastName") String lastName) {
                return new Teacher(firstName, lastName);
            }

        // Request a specific teacher. It will search from the existing values
            // http://localhost:8080/teacher/query?firstName=John&lastName=Smith
            @GetMapping("teacher/query")
            public Teacher teacherQueryParam(@RequestParam(name="firstName") String firstName, 
            @RequestParam(name="lastName") String lastName) {
                return new Teacher(firstName, lastName);
        }

    // POST (Create) HTTP Method
        // By using postman, we send a request using http://localhost:8080/teachers endpoint
        @PostMapping("/teachers")
        public void addTeacher(@RequestBody Teacher teacher) {
            teacherList.add(teacher);
        }

    // PUT (Update) HTTP Method
        // It should use http://localhost:8080/teacher/{nameToUpdate}/{lastnameToUpdate}
        @PutMapping("/teacher/{firstName}/{lastName}")
        public void updateTeacher(@PathVariable("firstName") String firstName,
        @PathVariable("lastName") String lastName, @RequestBody Teacher updateTeacher) {
            for (Teacher teacher : teacherList) {
                if(teacher.getFirstName().equals(firstName) && teacher.getLastName().equals(lastName)) {
                    teacher.setFirstName(updateTeacher.getFirstName());
                    teacher.setLastName(updateTeacher.getLastName());
                }
            }
        }
    
    // DELETE HTTP Method
        // It should use http://localhost:8080/teacher/{nameToDelete}/{lastnameToDelete}
        @DeleteMapping("/teacher/{firstName}/{lastName}")
        public void deleteTeacher(@PathVariable("firstName") String firstName, 
        @PathVariable("lastName") String lastName) {
            for (Teacher teacher : teacherList) {
                if (teacher.getFirstName().equals(firstName) && teacher.getLastName().equals(lastName)) {
                    teacherList.remove(teacher);
                }
            }
        }
}

