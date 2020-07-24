package com.ams.response;

import com.ams.modal.Employee;

public class EmployeeResponse {
    private int id;
    private String empId;
    private String name;

    public EmployeeResponse(int id, String empId, String name) {
        this.id = id;
        this.empId = empId;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
