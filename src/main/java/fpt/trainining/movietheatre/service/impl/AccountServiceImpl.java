package fpt.trainining.movietheatre.service.impl;

import fpt.trainining.movietheatre.entity.Account;
import fpt.trainining.movietheatre.exception.ResourceNotFoundException;
import fpt.trainining.movietheatre.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@Primary
public class AccountServiceImpl implements fpt.trainining.movietheatre.service.AccountService {

    @Autowired private AccountRepository accountRepository;

    @Override
    public Collection<Account> findAll() {
        return accountRepository.findAll();
    }

    @Override
    public Account findById(Object id) {
        return accountRepository.findById((String) id)
                .orElseThrow(() -> new ResourceNotFoundException("Cannot find account id: " + id));
    }

    @Override
    public Account save(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public void remove(Object id) {
        accountRepository.deleteById((String) id);
    }

    @Override
    public Account findByUsername(String username) {
        return accountRepository.findByUsername(username)
                .orElseThrow(() -> new ResourceNotFoundException("Cannot find account name: " + username));
    }
}
