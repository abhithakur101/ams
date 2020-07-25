package com.ams.modal;

import com.ams.enums.Role;
import com.ams.enums.Shift;

import javax.persistence.*;
import java.util.Arrays;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {
    @Id
    @GeneratedValue
    @Column
    private int id;
    @Column(name = "EMP_ID")
    private String empId;
    @Column(name = "EMP_NAME")
    private String empName;
    @Column(name = "EMP_PASSWORD")
    private String empPassword;
    @Column(name = "EMP_EMAIL")
    private String empEmail;
    @Column(name = "EMP_MOBILE")
    private String empMobile;
    @Column(name = "MANAGER_ID")
    private String managerId;
    @Column(name = "EMP_ADDRESS")
    private String empAddress;
    @Column(name = "EMP_PIC", length = 100000)
    private Byte[] empPic;
    @Column(name = "EMP_DESIGNATION")
    private String Designation;
    @Column(name = "OFFICE_ADDRESS")
    private String OfficeAddress;
    @Column(name = "EMP_ROLE")
    private Role empRole;
    @Column(name = "EMP_SHIFT")
    private Shift shift;
    @Column(name = "CREATED_DATE")
    private String CreatedDate;
    @Column(name = "CREATED_BY")
    private String CreatedBy;
    @Column(name = "MODIFIED_DATE")
    private String ModifiedDate;
    @Column(name = "MODIFIED_BY")
    private String ModifiedBy;
    @Column(name = "ACTIVE_STATUS")
    private String ActiveStatus;

    public Employee() {
    }

    public Employee(int id, String empId, String empName, String empPassword, String empEmail, String empMobile, String managerId, String empAddress, Byte[] empPic, String designation, String officeAddress, Role empRole, Shift shift
            , String createdDate, String createdBy, String modifiedDate, String modifiedBy, String activeStatus) {
        this.empId = empId;
        this.empName = empName;
        this.empPassword = empPassword;
        this.empEmail = empEmail;
        this.empMobile = empMobile;
        this.managerId = managerId;
        this.empAddress = empAddress;
        this.empPic = empPic;
        Designation = designation;
        OfficeAddress = officeAddress;
        this.empRole = empRole;
        this.shift = shift;
        this.id = id;
        CreatedDate = createdDate;
        CreatedBy = createdBy;
        ModifiedDate = modifiedDate;
        ModifiedBy = modifiedBy;
        ActiveStatus = activeStatus;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", empId='" + empId + '\'' +
                ", empName='" + empName + '\'' +
                ", empPassword='" + empPassword + '\'' +
                ", empEmail='" + empEmail + '\'' +
                ", empMobile='" + empMobile + '\'' +
                ", managerId='" + managerId + '\'' +
                ", empAddress='" + empAddress + '\'' +
                ", empPic=" + Arrays.toString(empPic) +
                ", Designation='" + Designation + '\'' +
                ", OfficeAddress='" + OfficeAddress + '\'' +
                ", empRole=" + empRole +
                '}';
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

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpPassword() {
        return empPassword;
    }

    public void setEmpPassword(String empPassword) {
        this.empPassword = empPassword;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public String getEmpMobile() {
        return empMobile;
    }

    public void setEmpMobile(String empMobile) {
        this.empMobile = empMobile;
    }

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    public Byte[] getEmpPic() {
        return empPic;
    }

    public void setEmpPic(Byte[] empPic) {
        this.empPic = empPic;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String designation) {
        Designation = designation;
    }

    public String getOfficeAddress() {
        return OfficeAddress;
    }

    public void setOfficeAddress(String officeAddress) {
        OfficeAddress = officeAddress;
    }

    public Role getEmpRole() {
        return empRole;
    }

    public void setEmpRole(Role empRole) {
        this.empRole = empRole;
    }

    public Shift getShift() {
        return shift;
    }

    public void setShift(Shift shift) {
        this.shift = shift;
    }

    public String getCreatedDate() {
        return CreatedDate;
    }

    public void setCreatedDate(String createdDate) {
        CreatedDate = createdDate;
    }

    public String getCreatedBy() {
        return CreatedBy;
    }

    public void setCreatedBy(String createdBy) {
        CreatedBy = createdBy;
    }

    public String getModifiedDate() {
        return ModifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        ModifiedDate = modifiedDate;
    }

    public String getModifiedBy() {
        return ModifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        ModifiedBy = modifiedBy;
    }

    public String getActiveStatus() {
        return ActiveStatus;
    }

    public void setActiveStatus(String activeStatus) {
        ActiveStatus = activeStatus;
    }


}
