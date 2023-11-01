package com.dickyms.xmart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dickyms.xmart.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long>{
    
}
