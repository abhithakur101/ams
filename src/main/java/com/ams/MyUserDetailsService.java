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

        Employee employee = userRepository.findByEmpMobile(s);
        String mobile = employee.getEmpMobile();
        String password = employee.getEmpPassword();
        System.out.println("username " + mobile + "password  " + password);
        return new User(mobile, password, new ArrayList<>());
    }
}