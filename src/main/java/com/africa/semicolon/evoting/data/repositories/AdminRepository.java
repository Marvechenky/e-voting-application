package com.africa.semicolon.evoting.data.repositories;

import com.africa.semicolon.evoting.data.models.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {


}
