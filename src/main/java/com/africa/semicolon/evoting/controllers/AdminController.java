package com.africa.semicolon.evoting.controllers;


import com.africa.semicolon.evoting.data.dtos.requests.VoterRegistrationRequest;
import com.africa.semicolon.evoting.data.dtos.responses.VoterRegistrationResponse;
import com.africa.semicolon.evoting.services.AdminService.AdminService;
import com.africa.semicolon.evoting.utils.ApiResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZonedDateTime;

@RestController
@RequestMapping("api/v1/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/registerVoter")
    public ResponseEntity<?> register(@RequestBody VoterRegistrationRequest voterRegistrationRequest,
                                      HttpServletRequest httpServletRequest){
        VoterRegistrationResponse registerVoter = adminService.registerVoter(voterRegistrationRequest);
        ApiResponse apiResponse = ApiResponse.builder()
                .timeStamp(ZonedDateTime.now())
                .data(registerVoter)
                .path(httpServletRequest.getRequestURI())
                .statusCode(HttpStatus.OK.value())
                .isSuccessful(true)
                .build();

        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }


}
