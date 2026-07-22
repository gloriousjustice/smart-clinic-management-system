package com.smartcare.clinic.controller;

import com.smartcare.clinic.model.Doctor;
import com.smartcare.clinic.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/doctors")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @GetMapping
    public ResponseEntity<List<Doctor>> getAllDoctors() {
        return ResponseEntity.ok(doctorService.getAllDoctors());
    }

    @PostMapping
    public ResponseEntity<Doctor> addDoctor(@RequestBody Doctor doctor) {
        return ResponseEntity.status(HttpStatus.CREATED).body(doctorService.saveDoctor(doctor));
    }

    @GetMapping("/{user}/{doctorId}/{date}/{token}")
    public ResponseEntity<?> getDoctorAvailability(
            @PathVariable("user") String user,
            @PathVariable("doctorId") Long doctorId,
            @PathVariable("date") String date,
            @PathVariable("token") String token) {
        
        if (token == null || token.trim().isEmpty() || token.equals("invalid")) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid authentication token security check failed.");
        }
        
        List<String> availability = doctorService.getDoctorAvailability(doctorId, date);
        return ResponseEntity.ok(availability);
    }
}
