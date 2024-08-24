package com.restapi.springboot.BankingSpringBoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.restapi.springboot.BankingSpringBoot.entity.Account;
import com.restapi.springboot.BankingSpringBoot.repository.AccountRepository;

@Service
public class AccountService{

	@Autowired
	AccountRepository accountRepo;
	
	public Account createAccount(Account account) {
		
		return accountRepo.save(new Account(account.getId(),account.getAccountHolderName(),account.getBalance()));
				
	}
	
	public List<Account> getAllAccounts(){
		
		return accountRepo.findAll();
		
	}

	
	public Account getAccountById(Long accountId) {
		
		return accountRepo.findById(accountId).get();
		
	}
	
	public Account deleteAccount(Long accountId) {
		
		
		accountRepo.deleteById(accountId);
		return null;
		
		 
		
	}
	
	public Account depositAmount(Long id,Double amt) {
		
		Account acc = accountRepo.findById(id).get();
		double total = acc.getBalance() + amt;
		
		acc.setBalance(total);
		Account savedacc = accountRepo.save(acc);
		
		return savedacc;
	}
	
	public Account withdraw(Long id,Double amt) {
		
		Account acc = accountRepo.findById(id).get();
	
		if(acc.getBalance() < amt) {
			
			throw new RuntimeException("Insufficent Balance !!!!");
			
		}
		
		double total = acc.getBalance() - amt;
		
		acc.setBalance(total);
		Account savedacc = accountRepo.save(acc);
		return savedacc;
		
		
		
	}
	 
	
}
