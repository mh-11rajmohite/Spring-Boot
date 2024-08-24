package com.restapi.springboot.BankingSpringBoot.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.springboot.BankingSpringBoot.entity.Account;
import com.restapi.springboot.BankingSpringBoot.service.AccountService;

@RestController	
@RequestMapping("/api")
public class AccountController {

	@Autowired
	AccountService accountService;
	
	@GetMapping("/home")
	public String home() {
		
		return "Welcom to Banking Application";
		
	}
	
	@PostMapping("/account")
	public ResponseEntity<Account> addAccount(@RequestBody Account account) {
		
		Account savedAccount = accountService.createAccount(account);
		return new ResponseEntity<Account>(savedAccount,HttpStatus.CREATED);
	}
	
	@GetMapping("/account")
	public ResponseEntity<List> getAllAccount(){
		
		List<Account> accList = new ArrayList<>();
		accountService.getAllAccounts().forEach(accList::add);

		if(accList.isEmpty()) {
			
			return new ResponseEntity<List>(HttpStatus.NO_CONTENT);
			
		}
	
		return new ResponseEntity<List>(accList, HttpStatus.OK);
	}
	
	
	@GetMapping("/account/{id}")
	public ResponseEntity<Account> getSingleAccount(@PathVariable("id") Long accountId){
		
		Account acc = accountService.getAccountById(accountId);
		
		if(acc!=null) {
		
			return new ResponseEntity<Account>(acc,HttpStatus.FOUND);
			
		}
		
		return new ResponseEntity<Account>(HttpStatus.NOT_FOUND);
	}
	
	@DeleteMapping("/account/{id}")
	public ResponseEntity<String> deleteAccount(@PathVariable Long id){
		
		Account acc = accountService.getAccountById(id);
		if(acc!=null) {
	
			accountService.deleteAccount(id);
			return new ResponseEntity<String>("Account Deleted Successfully",HttpStatus.OK);
			
		}
		return new ResponseEntity<String>("",HttpStatus.NOT_FOUND);
		
	}

	@PutMapping("/account/{id}/deposit")
	public ResponseEntity<Account> depositAmt(@PathVariable("id") Long id,@RequestBody Map<String,Double> amt){
		
		Account acc = accountService.depositAmount(id, amt.get("amount"));
		
		return new ResponseEntity<Account>(HttpStatus.OK);
		
	}
	
	
	
	
	@PutMapping("/account/{id}/withdraw")
	public ResponseEntity<Account> withdraw(@PathVariable("id") Long id,@RequestBody Map<String,Double> map){
		
		Account acc = accountService.withdraw(id, map.get("amount"));
		return new ResponseEntity<Account>(HttpStatus.OK);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


















