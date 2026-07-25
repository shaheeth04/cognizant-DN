package com.cognizant.account.controller;

import com.cognizant.account.model.Account;
import com.cognizant.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    // GET mapping matching /accounts/{number}
    @GetMapping("/accounts/{number}")
    public Account getAccountDetails(@PathVariable String number) {
        return accountService.getAccountDetails(number);
    }
}