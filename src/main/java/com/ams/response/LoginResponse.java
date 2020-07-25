package com.ams.response;

import com.ams.modal.Login;

public class LoginResponse {
    public Login login;
    public String message;

    public LoginResponse() {

    }

    public LoginResponse(Login login, String message) {
        this.login = login;
        this.message = message;
    }


}
