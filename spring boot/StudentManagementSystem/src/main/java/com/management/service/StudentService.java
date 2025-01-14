package com.management.service;

import com.management.entity.Student;
import com.management.entity.Trainer;
import com.management.repository.StudentRepository;
import com.management.repository.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudent()
    {
        return  studentRepository.findAll();
    }

    public Student getStudentById(long id)
    {
        return  studentRepository.findById(id).orElseThrow();
    }
    public void createStudent(Student student)
    {
         studentRepository.save(student);
    }
    public void deleteStudent(long id)
    {
        studentRepository.deleteById(id);
    }
}
