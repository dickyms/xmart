package com.dickyms.xmart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dickyms.xmart.model.Transaction;
import com.dickyms.xmart.repository.TransactionRepository;

@Service
public class TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;

    public List<Transaction> getTransactions() {
        return transactionRepository.findAll();
    }

    public Transaction geTransactionById(Long id) {
        return transactionRepository.findById(id).orElse(null);
    }

    public Transaction save (Transaction data) {
        return transactionRepository.save(data);
    }

}
