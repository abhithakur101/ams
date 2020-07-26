package com.ams.response;

import com.ams.modal.Employee;

import java.io.Serializable;

public class AuthenticationResponse implements Serializable {

	private static final long serialVersionUID = -2258400154026835629L;

	private final Employee employee;

    private final String jwt;

    public AuthenticationResponse(String jwt,Employee employee) {
        this.jwt = jwt;
        this.employee=employee;
    }

    public String getJwt() {
        return jwt;
    }

    public Employee getEmployee() {
        return employee;
    }
}
