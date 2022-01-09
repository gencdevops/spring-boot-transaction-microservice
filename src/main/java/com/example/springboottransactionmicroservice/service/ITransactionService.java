package com.example.springboottransactionmicroservice.service;

import com.example.springboottransactionmicroservice.model.Transaction;

import java.util.List;

public interface ITransactionService {
    Transaction saveTransaction(Transaction transaction);

    void deleteTransaction(Long transactionId);

    List<Transaction> findAllTransactionOfUser(Long userId);
}
