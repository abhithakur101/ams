package com.ams.modal;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class Login {
    @Id
    @GeneratedValue
    private int id;
    private String token;
    private String empId;
    @Temporal(TemporalType.DATE)
    private Date date;
    @Temporal(TemporalType.TIME)
    private Date time;

    public Login() {
    }

    public Login(int id, String token, String empId, Date date, Date time) {
        this.id = id;
        this.token = token;
        this.empId = empId;
        this.date = date;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
