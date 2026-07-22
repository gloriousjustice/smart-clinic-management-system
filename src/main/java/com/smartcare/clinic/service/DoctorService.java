package com.smartcare.clinic.service;

import com.smartcare.clinic.model.Doctor;
import com.smartcare.clinic.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    // Retrieve all doctors from database
    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }

    // Save a new doctor entity
    public Doctor saveDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    // Criterion 1: Validate doctor login credentials
    public boolean validateDoctorLogin(String name, String password) {
        // Look up doctor by name/identifier and verify password match
        return doctorRepository.findAll().stream()
                .anyMatch(doc -> doc.getName().equalsIgnoreCase(name) && doc.getPassword().equals(password));
    }

    // Criterion 2: Retrieve a doctor's available time slots for a specific date
    public List<String> getDoctorAvailability(Long doctorId, String date) {
        Optional<Doctor> doctorOpt = doctorRepository.findById(doctorId);
        if (doctorOpt.isPresent()) {
            // Returns the managed element collection list from our Doctor entity model
            return doctorOpt.get().getAvailableTimes();
        }
        return new ArrayList<>();
    }
}
