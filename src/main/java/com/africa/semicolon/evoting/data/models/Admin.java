package com.africa.semicolon.evoting.data.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty(message = "This field is required")
    @NotEmpty(message = "This field is required")
    private String firstName;

    @NotEmpty(message = "This field is required")
    @NotEmpty(message = "This field is required")
    private String lastName;

    @NotEmpty(message = "This field is required")
    @NotEmpty(message = "This field is required")
    private String username;

    @NotEmpty(message = "This field is required")
    @NotEmpty(message = "This field is required")
    private String email;

    private String password;

}
