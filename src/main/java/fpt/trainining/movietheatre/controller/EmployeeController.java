package fpt.trainining.movietheatre.controller;

import fpt.trainining.movietheatre.dto.ResponseHandler;
import fpt.trainining.movietheatre.dto.employee.EmployeeCreateReq;
import fpt.trainining.movietheatre.entity.Employee;
import fpt.trainining.movietheatre.service.EmployeeService;
import fpt.trainining.movietheatre.service.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {

    @Autowired private EmployeeService employeeService;
    @Autowired private EmployeeMapper employeeMapper;

    @GetMapping
    public ResponseEntity findAll() {
        List<Employee> employees = (List<Employee>) employeeService.findAll();
        return ResponseHandler.generateResponse("Find all employees successfully!", HttpStatus.OK, employees);
    }

    @PostMapping
    public ResponseEntity create(@RequestBody EmployeeCreateReq req) {
        Employee employee = employeeMapper.employeeCreateReqToEmployee(req);
        Employee res = employeeService.save(employee);
        return ResponseHandler.generateResponse("Create employee successfully!", HttpStatus.CREATED, res);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable String id) {
        employeeService.deleteEmployee(id);
        return ResponseHandler.generateResponse("Delete employee successfully!", HttpStatus.OK, null);
    }


}
