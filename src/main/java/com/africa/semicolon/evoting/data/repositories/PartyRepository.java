package com.africa.semicolon.evoting.data.repositories;


import com.africa.semicolon.evoting.data.models.Party;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PartyRepository extends JpaRepository<Party, Long> {

}
