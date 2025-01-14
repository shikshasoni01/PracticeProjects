package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Bank;

@Repository
public interface BankRepository extends JpaRepository<Bank,Integer>{

}
