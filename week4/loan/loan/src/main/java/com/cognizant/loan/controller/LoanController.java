package com.cognizant.loan.controller;

import com.cognizant.loan.model.Loan;
import com.cognizant.loan.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {

    @Autowired
    private LoanService loanService;
    @GetMapping("/loans/{number}")
    public Loan getLoanDetails(@PathVariable String number) {
        return loanService.getLoanDetails(number);
    }
}