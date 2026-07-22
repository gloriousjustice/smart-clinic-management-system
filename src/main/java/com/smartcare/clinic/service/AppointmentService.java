package com.smartcare.clinic.service;

import com.smartcare.clinic.model.Appointment;
import com.smartcare.clinic.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    // Persist and create new appointments into database storage
    public Appointment createAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    // Retrieve and filter appointments by Doctor ID and an explicit String date criterion
    public List<Appointment> getAppointmentsByDoctorAndDate(Long doctorId, String dateStr) {
        // Parse date string (e.g., '2026-07-22') into start and end of that specific day
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        java.time.LocalDate targetDate = java.time.LocalDate.parse(dateStr, formatter);
        LocalDateTime startOfDay = targetDate.atStartOfDay();
        LocalDateTime endOfDay = targetDate.atTime(23, 59, 59);

        // Fetch using repository persistence layer and apply matching filters
        return appointmentRepository.findAll().stream()
                .filter(app -> app.getDoctor() != null && app.getDoctor().getDoctorId().equals(doctorId))
                .filter(app -> app.getAppointmentTime() != null && 
                               !app.getAppointmentTime().isBefore(startOfDay) && 
                               !app.getAppointmentTime().isAfter(endOfDay))
                .collect(Collectors.toList());
    }
}
