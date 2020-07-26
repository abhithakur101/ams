package com.ams.service;

import com.ams.enums.Shift;
import com.ams.modal.Employee;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeService {

     public Employee findByEmpMobile(String EmpMobile);

     public Employee updateEmployee(String empName,  String empMobile,  String empEmail, String empAddress,
                              byte[] empPic,  String Designation, String empPassword,
                               String OfficeAddress,  Shift shift,String empId);
     public List<Employee> findAll();
    public void addEmployee(Employee employee);
}
