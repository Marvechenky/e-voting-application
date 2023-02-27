package com.africa.semicolon.evoting.data.repositories;

import com.africa.semicolon.evoting.data.models.Election;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElectionRepository extends JpaRepository<Election, Long> {

}
