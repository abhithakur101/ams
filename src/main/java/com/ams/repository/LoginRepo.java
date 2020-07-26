package com.ams.repository;

import com.ams.modal.Login;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepo extends JpaRepository<Login, Integer> {
 
	public Login findByToken(String token);
}
