package com.ams.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ams.modal.Attendance;

/**
 * 
 * 
 * @author ABHISHEK
 *
 */
@Repository
public interface AttendanceRepo extends JpaRepository<Attendance, Long> {

}
