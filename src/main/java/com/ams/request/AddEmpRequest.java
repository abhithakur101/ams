package com.ams.request;

import com.ams.enums.Role;
import com.ams.enums.Shift;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;

import java.util.Arrays;

public class AddEmpRequest {
        private int id;
    
        private String empId;
  
        private String empName;
          private String empPassword;
          private String empEmail;
          private String empMobile;
          private String managerId;
          private String empAddress;
          private MultipartFile empPic;
          private String Designation;
          private String OfficeAddress;
          private Role empRole;
          private Shift shift;
          private String CreatedDate;
          private String CreatedBy;
          private String ModifiedDate;
          private String ModifiedBy;
          private String ActiveStatus;

        public AddEmpRequest() {
        }

        public AddEmpRequest(int id, String empId, String empName, String empPassword, String empEmail, String empMobile, String managerId, String empAddress, MultipartFile empPic, String designation, String officeAddress, Role empRole, Shift shift
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

        public MultipartFile getEmpPic() {
            return empPic;
        }

        public void setEmpPic(MultipartFile empPic) {
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
    