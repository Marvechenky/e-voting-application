package com.africa.semicolon.evoting.data.models;

import com.africa.semicolon.evoting.enums.PartyAccroymn;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
public class Party {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @NotEmpty(message = "This field is required")
    @NotBlank(message = "This field is required")
    private String fullName;

    private LocalDate dateOfRegistration;

    @Enumerated(EnumType.STRING)
    private PartyAccroymn partyAccroymn;
}
