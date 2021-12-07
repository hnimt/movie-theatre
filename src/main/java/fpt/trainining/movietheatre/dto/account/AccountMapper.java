package fpt.trainining.movietheatre.dto.account;

import fpt.trainining.movietheatre.entity.Account;
import fpt.trainining.movietheatre.entity.Role;
import fpt.trainining.movietheatre.service.RoleService;
import org.dom4j.rule.Mode;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class AccountMapper {

    @Autowired private RoleService roleService;
    @Autowired private ModelMapper mapper;

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

    public Account accountUpdateReqToAccount(AccountUpdateReq accountUpdateReq) {
        Account account = mapper.map(accountUpdateReq, Account.class);
        if (accountUpdateReq.getRoleName() != null) {
            Role role = roleService.findByRoleName(accountUpdateReq.getRoleName());
            account.setRole(role);
        }
        return account;
    }
}
