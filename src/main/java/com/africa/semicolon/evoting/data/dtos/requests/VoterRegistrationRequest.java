package com.africa.semicolon.evoting.data.dtos.requests;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
public class VoterRegistrationRequest {

    @NotNull(message = "This field is required")
    @NotEmpty(message = "This field is required")
    private String firstName;

    @NotNull(message = "This field is required")
    @NotEmpty(message = "This field is required")
    private String middleName;

    @NotNull(message = "This field is required")
    @NotEmpty(message = "This field is required")
    private String lastName;

    private LocalDate DateOfBirth;

    @NotNull(message = "This field is required")
    @NotEmpty(message = "This field is required")
    private String gender;

    @NotNull(message = "This field is required")
    @NotEmpty(message = "This field is required")
    private String maritalStatus;

    @NotNull(message = "This field is required")
    @NotEmpty(message = "This field is required")

    @NotNull(message = "This field is required")
    @NotEmpty(message = "This field is required")
    private String phoneNumber;

    @NotNull(message= "This field is required")
    @Email(message = "This field requires a valid email address")
    private String email;

    @NotNull(message = "This field is required")
    @NotEmpty(message = "This field is required")
    private String Address;

    @NotNull(message = "This field is required")
    @NotEmpty(message = "This field is required")
    private String occupation;

}
