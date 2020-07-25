package com.ams.restcontroller;

import com.ams.modal.Login;
import com.ams.repository.LoginRepo;
import com.ams.response.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Random;

@RestController
public class LoginController {
    @Autowired
    LoginRepo loginRepo;

    @PostMapping(value = "/login", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public Login insert(@ModelAttribute Login login) {
        int leftLimit = 48; // numeral '0'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 126;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        System.out.println(generatedString);
        String token = generatedString;
        login.setToken(token);
        Date date = new Date();
        login.setDate(date);
        loginRepo.save(login);
        return login;
    }

    public LoginResponse checkSession(String token) {
        Login Token = loginRepo.findByToken(token);

        if (token == null) {
            LoginResponse loginResponse = new LoginResponse(Token, "Your Token Got Expired or Removed !");
            return loginResponse;
        } else {
            LoginResponse loginResponse = new LoginResponse(Token, "Login Successfully !");
            return loginResponse;
        }
    }
}
