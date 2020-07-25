package com.ams;

import com.ams.modal.Employee;
import com.ams.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    UserRepository userRepository;


    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

        Employee employee = userRepository.findByEmpId(s);
        String username = employee.getEmpId();
        String password = employee.getEmpPassword();
        System.out.println("username " + username + "password  " + password);
        return new User(username, password, new ArrayList<>());
    }
}