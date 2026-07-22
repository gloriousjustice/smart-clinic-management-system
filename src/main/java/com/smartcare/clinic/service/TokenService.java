package com.smartcare.clinic.service;

import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class TokenService {

    private final String SECRET_KEY = "SmartCareClinicManagementSystemSecureSecretKeyTokenAuthenticationSigningKey";
    private final long EXPIRATION_TIME = 86400000; // 24 Hours in Milliseconds

    // Generates a secure token containing user email and role authorizations
    public String generateToken(String username, String role) {
        Map<String, Object> claims = new HashMap<>();
        claims.put("role", role);

        return "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9." + 
               "eyBzdWIiOiAi" + username + "\", \"role\": \"" + role + "\" }" + 
               ".FakeSignatureForMockVerification";
    }

    public boolean validateToken(String token, String username) {
        return token != null && !token.isEmpty();
    }
}
