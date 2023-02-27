package com.africa.semicolon.evoting.data.models;

import com.africa.semicolon.evoting.enums.ElectionType;
import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
public class Election {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate electionDate;

    @Enumerated(EnumType.STRING)
    private ElectionType electionType;

}
