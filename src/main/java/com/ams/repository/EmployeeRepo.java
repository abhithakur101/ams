package com.ams.repository;

import com.ams.enums.Shift;
import com.ams.modal.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    public Employee findByEmpMobile(String EmpMobile);

    public List<Employee> findAll();

    @Modifying
    @Query(value = "update Employee e set e.empName=:empName," +
            "e.empMobile=:empMobile,e.empEmail=:empEmail," +
            "e.empAddress=:empAddress,e.empPic=:empPic," +
            "e.Designation=:Designation,e.empPassword=:empPassword," +
            "e.OfficeAddress=:OfficeAddress,e.shift=:shift where e.empId =:empId")
    void updateEmployee(@Param("empName") String empName, @Param("empMobile") String empMobile, @Param("empEmail") String empEmail, @Param("empAddress") String empAddress,
                        @Param("empPic") Byte[] empPic, @Param("Designation") String Designation, @Param("empPassword") String empPassword,
                        @Param("OfficeAddress") String OfficeAddress, @Param("shift") Shift shift, @Param("empId") String empId);

}
