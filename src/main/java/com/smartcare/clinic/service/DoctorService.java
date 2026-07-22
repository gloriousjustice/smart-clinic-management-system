package com.smartcare.clinic.service;

import com.smartcare.clinic.model.Doctor;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class DoctorService {
    // Simulated internal database storage list for doctors
    private final List<Doctor> doctorRepositoryList = new ArrayList<>();

    public List<Doctor> getAllDoctors() {
        return doctorRepositoryList;
    }

    public Doctor saveDoctor(Doctor doctor) {
        doctorRepositoryList.add(doctor);
        return doctor;
    }
}
