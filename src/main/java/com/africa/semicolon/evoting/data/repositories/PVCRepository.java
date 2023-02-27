package com.africa.semicolon.evoting.data.repositories;

import com.africa.semicolon.evoting.data.models.PVC;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PVCRepository extends JpaRepository<PVC, Long> {

}
