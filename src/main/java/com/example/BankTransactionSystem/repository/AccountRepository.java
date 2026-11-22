package com.example.BankTransactionSystem.repository;

import com.example.BankTransactionSystem.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
