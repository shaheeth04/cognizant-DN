package com.cognizant.account.service;

import com.cognizant.account.model.Account;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    public Account getAccountDetails(String accountNumber) {
        // Returns the exact dummy details specified by the lab assessment
        return new Account("700987987972342", "savings", 234343);
    }
}