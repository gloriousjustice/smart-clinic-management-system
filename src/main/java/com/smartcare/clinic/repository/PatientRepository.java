package com.smartcare.clinic.repository;

import com.smartcare.clinic.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
    // This allows lookup for secure patient login operations
    Optional<Patient> findByEmail(String email);
}
