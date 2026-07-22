package com.smartcare.clinic.repository;

import com.smartcare.clinic.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

    // Criterion 1: Retrieve a patient by email address
    Optional<Patient> findByEmail(String email);

    // Criterion 2: Retrieve a patient using either an email address OR a phone number
    Optional<Patient> findByEmailOrPhone(String email, String phone);
}
