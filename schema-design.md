# Smart Clinic Management System Database Schema

### 1. Patient Table
* patient_id (INT, Primary Key, Auto Increment)
* 
ame (VARCHAR)
* email (VARCHAR, Unique)
* phone (VARCHAR)

### 2. Doctor Table
* doctor_id (INT, Primary Key, Auto Increment)
* 
ame (VARCHAR)
* specialization (VARCHAR)
* vailability (VARCHAR)
* password (VARCHAR)

### 3. Appointment Table
* ppointment_id (INT, Primary Key, Auto Increment)
* patient_id (INT, Foreign Key references Patient.patient_id)
* doctor_id (INT, Foreign Key references Doctor.doctor_id)
* ppointment_date (DATETIME)
* status (VARCHAR)

### 4. Prescription Table
* prescription_id (INT, Primary Key, Auto Increment)
* ppointment_id (INT, Foreign Key references Appointment.appointment_id)
* doctor_id (INT, Foreign Key references Doctor.doctor_id)
* patient_id (INT, Foreign Key references Patient.patient_id)
* medication_details (TEXT)
* dosage (VARCHAR)
