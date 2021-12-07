package fpt.trainining.movietheatre.service.mapper;

import fpt.trainining.movietheatre.dto.account.AccountRegisterReq;
import fpt.trainining.movietheatre.dto.account.AccountUpdateReq;
import fpt.trainining.movietheatre.entity.Account;
import fpt.trainining.movietheatre.entity.Role;
import fpt.trainining.movietheatre.service.AccountService;
import fpt.trainining.movietheatre.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class AccountMapper {

    @Autowired private RoleService roleService;
    @Autowired private AccountService accountService;

    public Account accountRegisterReqToAccount(AccountRegisterReq accountRegisterDto) {
        Account account = new Account();
        account.setUsername(accountRegisterDto.getUsername());
        account.setPassword(accountRegisterDto.getPassword());
        account.setRegisterDate(LocalDate.now());

        if (accountRegisterDto.getRoleName() == null) {
            Role role = roleService.findByRoleName("CUSTOMER");
            account.setRole(role);
        } else {
            Role role = roleService.findByRoleName(accountRegisterDto.getRoleName());
            account.setRole(role);
        }
        return account;
    }

    public Account accountUpdateReqToAccount(String accountId, AccountUpdateReq accountUpdateReq) {
        Account account = accountService.findById(accountId);
        account.setAddress(accountUpdateReq.getAddress());
        account.setDateOfBirth(accountUpdateReq.getDateOfBirth());
        account.setEmail(accountUpdateReq.getEmail());
        account.setFullName(accountUpdateReq.getFullName());
        account.setGender(accountUpdateReq.getGender());
        account.setIdentityCard(accountUpdateReq.getIdentityCard());
        account.setImage(accountUpdateReq.getIdentityCard());
        account.setPhoneNumber(accountUpdateReq.getPhoneNumber());

        if (accountUpdateReq.getRoleName() != null) {
            Role role = roleService.findByRoleName(accountUpdateReq.getRoleName());
            account.setRole(role);
        }
        return account;
    }
}
