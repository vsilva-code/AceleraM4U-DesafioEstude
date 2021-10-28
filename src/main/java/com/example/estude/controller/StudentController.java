package com.example.estude.controller;

import com.example.estude.model.Student;
import com.example.estude.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private IStudentRepository studentRepository;


    @GetMapping
    public List<Student> list() {
        return studentRepository.findAll();
    }


    /*
   @GetMapping
    public List<Student> list(String name) {
        return studentRepository.findByNameContaining(name);
    }

     */

    @GetMapping("/{id}")
    public Student findStudentBy(@PathVariable Integer id) {
        return studentRepository.findById(id).get();
    }

    @PostMapping
    public Student addStudent(@RequestBody Student student) {
       return studentRepository.save(student);
    }
}
