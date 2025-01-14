package com.management.controller;

import org.springframework.stereotype.Controller;	
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.management.entity.Student;
import com.management.entity.Trainer;
import com.management.service.StudentService;
import com.management.service.TrainerService;

import java.util.List;
@Controller
@RequestMapping("/student")
public class StudentController {
	
	    @Autowired
	    private StudentService studentService;
	    @Autowired
	    private TrainerService trainerService;

	    @GetMapping("/getAllStudent")
	    public String getAllStudent(Model model)
	    {
	        List<Student> students= studentService.getAllStudent();
	        
	        model.addAttribute("students",students);
	        
	        return "ViewStudent";
	        
	    }
	    @GetMapping("/createStudentForm")
	    public String studentCreateForm(Model model)
	    {
	        Student student= new Student();
	        
	        List<Trainer> trainers=trainerService.getAllTrainer();	        
	        model.addAttribute("student",student);
	        model.addAttribute("Alltrainers",trainers);
	        
	        return "CreateStudentForm";
	        
	    }
	    @PostMapping("/createStudent")
	    public String createStudent(@ModelAttribute("student")Student student )
	    {
	        studentService.createStudent(student);   
	        return "redirect:/student/getAllStudent";
	        
	    }
	    
	    @GetMapping("/updateStudentForm/{id}")
	    public String updateStudentForm(@PathVariable Long id,Model model)
	    {
	        Student student= studentService.getStudentById(id);
	        
	        List<Trainer> trainers=trainerService.getAllTrainer();	        
	        model.addAttribute("Updatedstudent",student);
	        model.addAttribute("Alltrainers",trainers);
	      
	        return "UpdateStudentForm";
	        
	    }
	    @PostMapping("/updateStudent/{id}")
	    public String updateStudent( @PathVariable Long id,@ModelAttribute("Updatedstudent")Student student)
	    {
	       student.setId(id);
	       studentService.createStudent(student);
	       return "redirect:/student/getAllStudent";
	        
	    }
	   
	    @GetMapping("/deleteStudent/{id}")
	    public String deleteStudent(@PathVariable Long id)
	    {
	    	studentService.deleteStudent(id);  
	        return "redirect:/student/getAllStudent";
	    

	}

}
