package com.ams.restcontroller;
import com.ams.enums.Role;
import com.ams.modal.Employee;
import com.ams.repository.EmployeeRepo;
import com.ams.request.EmpRequest;
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
    public ResponseEntity<?> getEmployees(@ModelAttribute EmpRequest empRequest) {
        List<Employee> employees = null;
        Employee employee = employeeRepo.findByEmpMobile(empRequest.getMobile());
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

    @GetMapping("/getemployee")
    public ResponseEntity<?> getEmployee(@ModelAttribute EmpRequest empRequest) {
        Employee employee = employeeRepo.findByEmpMobile(empRequest.getMobile());
        try {
            if (employee.equals(null)) {
                return ResponseEntity.ok(new CommanResponse("Record Not Found", false));
            } else {
                return ResponseEntity.ok(new CommanResponse("User Data", true, employee));
            }
        } catch (Exception ex) {
            return ResponseEntity.ok(new CommanResponse(ex.getMessage(), false));
        }
    }

    @PostMapping("/addEmployee")
    public ResponseEntity<?> addEmployee(@RequestParam String EmpMobile, @ModelAttribute Employee employee) {
        Employee getemployee = employeeRepo.findByEmpMobile(EmpMobile);
        try {
            if (getemployee.equals(null)) {
                return ResponseEntity.ok(new CommanResponse("Record Not Found", false));
            } else {
                if (getemployee.getEmpRole().equals(Role.Admin) || getemployee.getEmpRole().equals(Role.Manager)) {
                    employeeRepo.save(employee);
                    return ResponseEntity.ok(new CommanResponse("User Data", true, employee));
                } else {
                    return ResponseEntity.ok(new CommanResponse("UnAutorized Request", false));
                }
            }
        } catch (Exception ex) {
            return ResponseEntity.ok(new CommanResponse(ex.getMessage(), false));
        }
    }

    public ResponseEntity<?> UpdateEmployee(@RequestParam String EmpMobile, @ModelAttribute Employee employee) {
        Employee getemployee = employeeRepo.findByEmpMobile(EmpMobile);

        try {
            if (getemployee.equals(null)) {
                return ResponseEntity.ok(new CommanResponse("Record Not Found", false));
            } else {
                if (getemployee.getEmpRole().equals(Role.Admin) || getemployee.getEmpRole().equals(Role.Manager)) {
                    employeeRepo.updateEmployee(employee.getEmpName(),
                            employee.getEmpMobile(), employee.getEmpEmail(), employee.getEmpAddress(),
                            employee.getEmpPic(), employee.getDesignation(), employee.getEmpPassword(), employee.getOfficeAddress(),
                            employee.getShift(), employee.getEmpId());

                    return ResponseEntity.ok(new CommanResponse("User Data", true, employee));
                } else {
                    return ResponseEntity.ok(new CommanResponse("UnAutorized Request", false));
                }
            }
        } catch (Exception ex) {
            return ResponseEntity.ok(new CommanResponse(ex.getMessage(), false));
        }
    }

    public void specificEmployee() {
    }
}
