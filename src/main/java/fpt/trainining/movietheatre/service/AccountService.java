package fpt.trainining.movietheatre.service;

import fpt.trainining.movietheatre.entity.Account;

public interface AccountService extends GeneralService<Account> {

    Account findByUsername(String username);
}
