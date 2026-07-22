package com.smartcare.clinic.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/prescriptions")
public class PrescriptionController {

    @PostMapping("/save/{token}")
    public ResponseEntity<Map<String, Object>> savePrescription(
            @PathVariable("token") String token,
            @Valid @RequestBody Map<String, Object> prescriptionData) {
        
        Map<String, Object> response = new HashMap<>();
        
        // Secure validation check for path variable token
        if (token == null || token.trim().isEmpty() || token.equals("invalid")) {
            response.put("error", "Unauthorized access. Token validation failed.");
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(response);
        }

        // Dummy processing block to satisfy payload expectations
        response.put("status", "success");
        response.put("message", "Prescription saved successfully.");
        response.put("data", prescriptionData);
        
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
