package com.ams.response;

import com.ams.modal.Employee;

import java.util.List;

public class CommanResponse {
    public String message;
    public Boolean status;
    public List<Employee> employees;



    public CommanResponse(String message, Boolean status, List<Employee> employees) {
        this.message = message;
       this. status = status;
        this.employees = employees;
    }

    public String getMESSAGE() {
        return message;
    }

    public void setMESSAGE(String message) {
        this.message = message;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
    	this.status = status;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
