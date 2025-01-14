package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Bank;
import com.example.repository.BankRepository;

@Service
public class BankService {

	@Autowired
	private BankRepository bankRepository;
	
	
	public List<Bank> getAllBank()
	{
		return bankRepository.findAll();
	}
	
	public Bank createBank(Bank bank)
	{
		return bankRepository.save(bank);
	}
}
