package com.africa.semicolon.evoting.data.repositories;

import com.africa.semicolon.evoting.data.models.Voter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoterRepository extends JpaRepository<Voter, Long> {
}
