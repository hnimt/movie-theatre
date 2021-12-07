package fpt.trainining.movietheatre.service;

import fpt.trainining.movietheatre.entity.Account;
import fpt.trainining.movietheatre.entity.Role;

public interface AccountService extends GeneralService<Account> {

    Account findByUsername(String username);
    Account updateRole(String accountId, String roleName);
}
