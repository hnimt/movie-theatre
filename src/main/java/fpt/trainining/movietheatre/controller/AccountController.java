package fpt.trainining.movietheatre.controller;

import fpt.trainining.movietheatre.dto.ResponseHandler;
import fpt.trainining.movietheatre.service.mapper.AccountMapper;
import fpt.trainining.movietheatre.dto.account.AccountUpdateReq;
import fpt.trainining.movietheatre.entity.Account;
import fpt.trainining.movietheatre.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/account")
public class AccountController {

    @Autowired private AccountService accountService;
    @Autowired private AccountMapper accountMapper;

    @GetMapping
    public ResponseEntity findAll() {
        List<Account> accounts = (List<Account>) accountService.findAll();
        return ResponseHandler.generateResponse("Find successfully!", HttpStatus.OK, accounts);
    }

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable String id) {
        Account account = accountService.findById(id);
        return ResponseHandler.generateResponse("Find successfully!", HttpStatus.OK, account);
    }

    @PutMapping("/{id}")
    public ResponseEntity updateAccount(@PathVariable String id, @RequestBody AccountUpdateReq accountUpdateReq) {
        Account account = accountMapper.accountUpdateReqToAccount(id, accountUpdateReq);
        Account result = accountService.save(account);
        return ResponseHandler.generateResponse("Update Successfully!", HttpStatus.OK, result);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteAccount(@PathVariable String id) {
        accountService.remove(id);
        return ResponseHandler.generateResponse("Delete Successfully!", HttpStatus.OK, null);
    }
}
