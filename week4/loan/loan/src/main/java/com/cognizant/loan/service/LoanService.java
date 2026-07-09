package com.cognizant.loan.service;

import com.cognizant.loan.model.Loan;
import org.springframework.stereotype.Service;

@Service
public class LoanService {

    public Loan getLoanDetails(String loanNumber) {
        return new Loan("H00987987972342", "car", 400000, 3258, 18);
    }
}