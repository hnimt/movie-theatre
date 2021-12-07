package fpt.trainining.movietheatre.service.impl;

import fpt.trainining.movietheatre.entity.Account;
import fpt.trainining.movietheatre.entity.Employee;
import fpt.trainining.movietheatre.exception.ResourceNotFoundException;
import fpt.trainining.movietheatre.repository.EmployeeRepository;
import fpt.trainining.movietheatre.service.AccountService;
import fpt.trainining.movietheatre.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired private EmployeeRepository employeeRepository;
    @Autowired private AccountService accountService;

    @Override
    public Collection<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(Object id) {
        return employeeRepository.findById((String) id)
                .orElseThrow(() -> new ResourceNotFoundException("Cannot found employee id: " + id));
    }

    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void remove(Object id) {
        employeeRepository.deleteById((String) id);
    }

    @Override
    @Transactional
    public void deleteEmployee(String employeeId) {
        Employee employee = findById(employeeId);
        accountService.remove(employee.getAccount().getAccountId());
        remove(employeeId);
    }
}
