package com.smartcare.clinic.service;

import com.smartcare.clinic.model.Appointment;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class AppointmentService {
    // Simulated internal database storage list for appointments
    private final List<Appointment> appointmentRepositoryList = new ArrayList<>();

    public List<Appointment> getAllAppointments() {
        return appointmentRepositoryList;
    }

    public Appointment createAppointment(Appointment appointment) {
        appointmentRepositoryList.add(appointment);
        return appointment;
    }
}
