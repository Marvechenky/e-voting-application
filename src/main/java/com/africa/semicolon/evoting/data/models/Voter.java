package com.africa.semicolon.evoting.data.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@Entity
@RequiredArgsConstructor
@Setter
@Getter
public class Voter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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

    @NotNull(message= "This field is required")
    @NotEmpty(message = "This field is required")
    private String gender;

    @NotNull(message= "This field is required")
    @NotEmpty(message = "This field is required")
    private String phoneNumber;

    @NotNull(message= "This field is required")
    @Email(message = "This field requires a valid email address")
    private String email;

    @NotNull(message= "This field is required")
    private String address;

    @NotNull(message= "This field is required")
    @NotEmpty(message = "This field is required")
    private String maritalStatus;

    @NotNull(message= "This field is required")
    @NotEmpty(message = "This field is required")
    private String occupation;

    @Enumerated(EnumType.STRING)
    private Boolean hasVoted = false;

    @OneToOne
    @JoinColumn(name = "pvc_serialNumber", referencedColumnName = "serialNumber")
    private PVC pvc;


}
