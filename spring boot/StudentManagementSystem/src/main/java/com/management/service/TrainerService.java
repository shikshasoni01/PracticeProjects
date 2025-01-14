package com.management.service;

import com.management.entity.Trainer;
import com.management.repository.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrainerService {

    @Autowired
    private TrainerRepository trainerRepository;

    public List<Trainer> getAllTrainer()
    {
        return  trainerRepository.findAll();
    }

    public Trainer getTrainerById(long id)
    {
        return  trainerRepository.findById(id).orElseThrow();
    }
    public void createTrainer(Trainer trainer)
    {
        trainerRepository.save(trainer);
    }
    public void deleteTrainer(long id)
    {
        trainerRepository.deleteById(id);
    }
   
}
