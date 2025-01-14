package com.management.controller;

import com.management.entity.Trainer;
import com.management.service.TrainerService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/trainer")
public class TrainerController {
    @Autowired
    private TrainerService trainerService;

    @GetMapping("/getAllTrainer")
    public String getAllTrainer(Model model)
    {
        List<Trainer> trainers= trainerService.getAllTrainer();
        
        model.addAttribute("trainers",trainers);
        
        return "ViewTrainer";
        
    }
    @GetMapping("/createTrainerForm")
    public String getCreateForm(Model model)
    {
        Trainer trainer= new Trainer();
        
        model.addAttribute("trainer",trainer);
        
        return "CreateTrainerForm";
        
    }
    @PostMapping("/createTrainer")
    public String createTrainer(@ModelAttribute("trainer")Trainer trainer)
    {
        trainerService.createTrainer(trainer);   
        return "redirect:/trainer/getAllTrainer";
        
    }
    
    @GetMapping("/updateTrainerForm/{id}")
    public String updateTrainerForm(@PathVariable Long id,Model model)
    {
        Trainer trainer= trainerService.getTrainerById(id);
        
        model.addAttribute("Updatedtrainer",trainer);
        
        return "UpdateTrainerForm";
        
    }
    @PostMapping("/{id}")
    public String updateTrainer( @PathVariable Long id,@ModelAttribute("Updatedtrainer")Trainer trainer)
    {
       trainer.setId(id);
       trainerService.createTrainer(trainer);
        return "redirect:/trainer/getAllTrainer";
        
    }
   
    @GetMapping("/deleteTrainer/{id}")
    public String deleteTrainer(@PathVariable Long id)
    {
        trainerService.deleteTrainer(id);   
        return "redirect:/trainer/getAllTrainer";
        
    }
    
    
    
    
    

}
