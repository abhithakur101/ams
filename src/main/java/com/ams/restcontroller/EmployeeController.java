package com.ams.restcontroller;
import com.ams.enums.Role;
import com.ams.modal.Employee;
import com.ams.request.AddEmpRequest;
import com.ams.request.EmpRequest;
import com.ams.response.CommanResponse;
import com.ams.serviceimpl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;


@CrossOrigin("*")
@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeServiceImpl employeeService;

    @GetMapping("/getemployees")
    public ResponseEntity<?> getEmployees(@ModelAttribute EmpRequest empRequest) {
        List<Employee> employees = null;
        Employee employee = employeeService.findByEmpMobile(empRequest.getMobile());
        try {
            if (employee.getEmpRole().equals(Role.Admin)) {
                employees = employeeService.findAll();
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
        Employee employee = employeeService.findByEmpMobile(empRequest.getMobile());
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

    public static byte[] compressBytes(byte[] data) {
        Deflater deflater = new Deflater();
        deflater.setInput(data);
        deflater.finish();
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream(data.length);
        byte[] buffer = new byte[1024];
        while (!deflater.finished()) {
            int count = deflater.deflate(buffer);
            outputStream.write(buffer, 0, count);
        }
        try {
            outputStream.close();
        } catch (IOException e) {
        }
        System.out.println("Compressed Image Byte Size - " + outputStream.toByteArray().length);
        return outputStream.toByteArray();
    }
    // uncompress the image bytes before returning it to the angular application
    public static byte[] decompressBytes(byte[] data) {
        Inflater inflater = new Inflater();
        inflater.setInput(data);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream(data.length);
        byte[] buffer = new byte[1024];
        try {
            while (!inflater.finished()) {
                int count = inflater.inflate(buffer);
                outputStream.write(buffer, 0, count);
            }
            outputStream.close();
        } catch (IOException ioe) {
        } catch (DataFormatException e) {
        }
        return outputStream.toByteArray();
    }
    @PostMapping("/addEmployee")
    public ResponseEntity<?> addEmployee(@RequestParam String EmpMobile, @ModelAttribute AddEmpRequest addEmpRequest) {
         Employee employee = new Employee();
         employee.setEmpId(addEmpRequest.getEmpId());
         employee.setActiveStatus(addEmpRequest.getActiveStatus());
         employee.setCreatedBy(addEmpRequest.getCreatedBy());
         employee.setDesignation(addEmpRequest.getDesignation());
         employee.setEmpAddress(addEmpRequest.getEmpAddress());
         employee.setEmpMobile(addEmpRequest.getEmpMobile());
         employee.setEmpEmail(addEmpRequest.getEmpEmail());
         employee.setEmpPassword(addEmpRequest.getEmpPassword());
         employee.setManagerId(addEmpRequest.getManagerId());
         employee.setOfficeAddress(addEmpRequest.getOfficeAddress());
         employee.setEmpAddress(addEmpRequest.getOfficeAddress());
         employee.setCreatedDate((new Date().toString()));
         employee.setModifiedBy(addEmpRequest.getModifiedBy());
         employee.setShift(addEmpRequest.getShift());
         employee.setModifiedDate(addEmpRequest.getModifiedDate());
         try {
             employee.setEmpPic(compressBytes(addEmpRequest.getEmpPic().getBytes()));
         }catch (Exception ex){

         }
         Employee getemployee = employeeService.findByEmpMobile(EmpMobile);
        try {
            if (getemployee.equals(null)) {
                return ResponseEntity.ok(new CommanResponse("Record Not Found", false));
            } else {
                if (getemployee.getEmpRole().equals(Role.Admin) || getemployee.getEmpRole().equals(Role.Manager)) {
                    employeeService.addEmployee(employee);
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
        Employee getemployee = employeeService.findByEmpMobile(EmpMobile);

        try {
            if (getemployee.equals(null)) {
                return ResponseEntity.ok(new CommanResponse("Record Not Found", false));
            } else {
                if (getemployee.getEmpRole().equals(Role.Admin) || getemployee.getEmpRole().equals(Role.Manager)) {
                    employeeService.updateEmployee(employee.getEmpName(),
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
