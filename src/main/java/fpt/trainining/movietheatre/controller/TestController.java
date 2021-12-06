package fpt.trainining.movietheatre.controller;

import fpt.trainining.movietheatre.dto.TestAccount;
import fpt.trainining.movietheatre.entity.Account;
import fpt.trainining.movietheatre.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired private AccountRepository accountRepository;

    @PostMapping
    public String testAddAccount(@RequestBody TestAccount testAccount) {
        Account account = new Account();
        account.setAddress(testAccount.getAddress());
        accountRepository.save(account);
        return "Success";
    }
}
