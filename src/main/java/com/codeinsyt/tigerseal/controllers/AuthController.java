package com.codeinsyt.tigerseal.controllers;

import com.codeinsyt.tigerseal.models.AuthenticationRequest;
import com.codeinsyt.tigerseal.services.impl.AuthServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class AuthController {

    @Autowired
    private AuthServiceImpl authService;


    @PostMapping("login")
    public ResponseEntity<?> testUser(@RequestBody AuthenticationRequest authenticationRequest) throws Exception {

        return new ResponseEntity<>(this.authService.loginUser(authenticationRequest.getUserName(),authenticationRequest.getPassword()), HttpStatus.OK);

    }


}
