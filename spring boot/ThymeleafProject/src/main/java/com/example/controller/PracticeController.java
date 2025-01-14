package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.entity.Bank;
import com.example.service.BankService;

@Controller
public class PracticeController {
	
	@Autowired
	private BankService bankService;

    @GetMapping("/welcome")
    public String show(Model model)
    {
        model.addAttribute("name","shiksha soni");
        return  "Welcome";
    }
    
    @GetMapping("/banks")
    public String bankInfo(Model model)
    {
//    	Bank b1=new Bank("State Bank of India","Bilaspur","SBI7328292");
//    	Bank b2=new Bank("Bank of India","Pune","BOI24810142");
//    	Bank b3=new Bank("HSBC","Raipur","HSBC75616731");
//    	Bank b4=new Bank("Bank of America","Mumbai","BOA82548492");
//    	Bank b5=new Bank("Icici","Nagpur","ICICI76489422");
//    	bankService.createBank(b1);
//    	bankService.createBank(b2);
//    	bankService.createBank(b3);
//    	bankService.createBank(b4);
//    	bankService.createBank(b5);
//    	List<Bank> banks= new ArrayList<>();
    	
//    	banks.add(b1);banks.add(b2);banks.add(b3);banks.add(b4);banks.add(b5);
    	List<Bank> banks= bankService.getAllBank();    	
    	model.addAttribute("banks",banks);
    	
    	return "BankData";
    }
}
