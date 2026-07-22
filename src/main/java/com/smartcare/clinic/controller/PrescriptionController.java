package com.smartcare.clinic.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;
import java.util.HashMap;

@RestController
@RequestMapping("/api/prescriptions")
public class PrescriptionController {

    // Simple routing placeholder to simulate MongoDB prescription generation mapping
    @PostMapping
    public ResponseEntity<Map<String, Object>> createPrescription(@RequestBody Map<String, Object> prescriptionData) {
        Map<String, Object> response = new HashMap<>(prescriptionData);
        response.put("status", "Prescription Saved to MongoDB");
        return ResponseEntity.ok(response);
    }
}
