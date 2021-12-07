package fpt.trainining.movietheatre.service;

import fpt.trainining.movietheatre.entity.Employee;

public interface EmployeeService extends GeneralService<Employee> {
    void deleteEmployee(String employeeId);
}
