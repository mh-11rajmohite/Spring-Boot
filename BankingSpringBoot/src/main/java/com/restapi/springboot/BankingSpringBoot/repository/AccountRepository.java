package com.restapi.springboot.BankingSpringBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restapi.springboot.BankingSpringBoot.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{

	
//	public Account createAccount(Account account);
	
}
