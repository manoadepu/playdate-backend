package com.playdate.controller;

import com.playdate.model.UserDetails;
import com.playdate.service.RegistrationService;
import io.restassured.response.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin
@RestController
@RequestMapping("/playdate")
@Validated
@RequiredArgsConstructor
public class RegistrationController {

    private final RegistrationService registrationService;

    //TODO: Add validations
    @PostMapping("/register")
    public void registerUser(@RequestBody @Valid UserDetails userDetails){
        Response response = registrationService.registerUser(userDetails);
        System.out.println(response.getStatusCode());
        System.out.println("wait!");
    }
}