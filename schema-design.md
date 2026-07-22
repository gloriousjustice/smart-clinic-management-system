# Smart Clinic Management System - Schema Design

## Relational Database (MySQL)
- Patient Table (patient_id, name, email, phone)
- Doctor Table (doctor_id, name, specialization, availability)
- Appointment Table (appointment_id, patient_id, doctor_id, date, status)

## NoSQL Database (MongoDB)
- Prescription Collection (prescription_id, appointment_id, medications, dosages, notes)
