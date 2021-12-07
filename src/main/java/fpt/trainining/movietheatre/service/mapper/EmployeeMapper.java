package fpt.trainining.movietheatre.service.mapper;

import fpt.trainining.movietheatre.dto.employee.EmployeeCreateReq;
import fpt.trainining.movietheatre.entity.Account;
import fpt.trainining.movietheatre.entity.Employee;
import fpt.trainining.movietheatre.entity.common.Roles;
import fpt.trainining.movietheatre.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeMapper {

    @Autowired private AccountService accountService;

    public Employee employeeCreateReqToEmployee (EmployeeCreateReq employeeCreateReq) {
        Employee employee = new Employee();
        Account account = accountService.updateRole(employeeCreateReq.getAccountId(), Roles.EMPLOYEE.getRoleName());
        employee.setAccount(account);
        return employee;
    }
}
