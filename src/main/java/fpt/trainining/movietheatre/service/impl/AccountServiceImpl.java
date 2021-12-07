package fpt.trainining.movietheatre.service.impl;

import fpt.trainining.movietheatre.entity.Account;
import fpt.trainining.movietheatre.entity.Role;
import fpt.trainining.movietheatre.exception.ResourceNotFoundException;
import fpt.trainining.movietheatre.repository.AccountRepository;
import fpt.trainining.movietheatre.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

@Service
@Primary
public class AccountServiceImpl implements fpt.trainining.movietheatre.service.AccountService {

    @Autowired private AccountRepository accountRepository;
    @Autowired private RoleService roleService;

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

    @Override
    @Transactional
    public Account updateRole(String accountId, String roleName) {
        Account account = findById(accountId);
        Role role = roleService.findByRoleName(roleName);
        account.setRole(role);
        return save(account);
    }
}
