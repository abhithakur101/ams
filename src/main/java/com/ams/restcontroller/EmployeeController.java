package com.ams.restcontroller;


import com.ams.enums.Role;
import com.ams.modal.Employee;
import com.ams.repository.EmployeeRepo;
import com.ams.response.CommanResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin("*")
@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeRepo employeeRepo;

    @GetMapping("/getemployees")
    public ResponseEntity<?> getEmployees(@RequestParam String EmpMobile) {
        List<Employee> employees = null;
        Employee employee = employeeRepo.findByEmpMobile(EmpMobile);
        try {
            if (employee.getEmpRole().equals(Role.Admin)) {
                employees = employeeRepo.findAll();
                if (employees.isEmpty()) {
                    return ResponseEntity.ok(new CommanResponse("Empty Database", true, employees));
                } else {
                    return ResponseEntity.ok(new CommanResponse("Autorized Request", true, employees));
                }
            } else {
                return ResponseEntity.ok(new CommanResponse("UnAutorized Request", false, employees));
            }
        } catch (Exception ex) {
            return ResponseEntity.ok(new CommanResponse(ex.getMessage(), false, employees));
        }
    }

    @GetMapping("/getemployees")
    public void getEmployee(@RequestParam String EmpMobile) {
        Employee employee = employeeRepo.findByEmpMobile(EmpMobile);

    }

    public void addEmployee() {
    }

    public void UpdateEmployee() {
    }

    public void specificEmployee() {
    }
}
