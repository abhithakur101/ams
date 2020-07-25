package com.ams.response;

import com.ams.modal.Employee;

import java.util.List;

public class CommanResponse {
    public String MESSAGE;
    public Boolean Status;
    public List<Employee> employees;



    public CommanResponse(String MESSAGE, Boolean status, List<Employee> employees) {
        this.MESSAGE = MESSAGE;
        Status = status;
        this.employees = employees;
    }

    public String getMESSAGE() {
        return MESSAGE;
    }

    public void setMESSAGE(String MESSAGE) {
        this.MESSAGE = MESSAGE;
    }

    public Boolean getStatus() {
        return Status;
    }

    public void setStatus(Boolean status) {
        Status = status;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
