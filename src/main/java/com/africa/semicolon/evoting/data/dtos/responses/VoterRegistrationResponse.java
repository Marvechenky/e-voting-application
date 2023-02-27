package com.africa.semicolon.evoting.data.dtos.responses;

import com.africa.semicolon.evoting.data.models.PVC;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
public class VoterRegistrationResponse {

    private String firstName;
    private String middleName;
    private String lastName;
    private LocalDate DateOfBirth;
    private String maritalStatus;
    private String occupation;
    private String Address;
    private String phoneNumber;
    private PVC pvc;
}
