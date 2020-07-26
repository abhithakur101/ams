package com.ams.serviceimpl;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ams.modal.Attendance;
import com.ams.repository.AttendanceRepo;
import com.ams.request.AttendanceRequset;
import com.ams.service.AttendenceService;

/**
 * Service class for Attendance managment
 * 
 * 
 * @author ABHISHEK
 *
 */
@Service
public class AttendenceServiceImpl implements AttendenceService {
	
	@Autowired
	AttendanceRepo repo;
	
	Calendar calendar = Calendar.getInstance();
	public String submitAttendence(AttendanceRequset attendanceRequset) {
		Attendance attendance  = new Attendance();
		attendance.setDate(calendar.getTime());
		attendance.setInTime(attendanceRequset.getInTime());
		attendance.setOutTime(attendanceRequset.getOutTime());
		attendance.setStatus("Absent");
		attendance.setLatitude(attendanceRequset.getLatitude());
		attendance.setLongitude(attendanceRequset.getLongitude());
		repo.save(attendance);
		return "successfully submitted attendence";
	}

}
