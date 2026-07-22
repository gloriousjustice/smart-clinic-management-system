# Smart Clinic Management System
The Smart Clinic Management System is a full-stack, containerized healthcare application engineered to modernize outpatient clinic operations by replacing legacy tracking systems with role-based digital portals. The platform optimizes administrative workflows, appointment scheduling, and health record management while maintaining secure, decoupled data layers for patient care optimization.

This project represents the comprehensive final deliverable for the **Java Development Capstone Project** course, hosted on the **Coursera** platform, as part of the **Core Java** professional training curriculum.

## Technical Specifications and Scope
- **Academic Context**: This software was developed within the Java Development Capstone Project framework on Coursera, focusing on full-stack microservices architecture, secure role-based authentication, polyglot persistence engineering, and automated DevOps deployment.
- **Architecture and Engineering**:
  - **Backend Framework**: Spring Boot (Java) implementing a clean Model-View-Controller (MVC) architecture pattern.
  - **Security Layer**: JSON Web Tokens (JWT) for stateless, secure, role-based access control and token-based session management.
  - **Relational Data Layer**: MySQL database for structured, transactional data management including explicit Entity-Relationship mappings.
  - **NoSQL Data Layer**: MongoDB for storing flexible, document-based prescription schemas and unstructured medical notes.
  - **Object-Relational Mapping**: Java Persistence API (JPA) with Hibernate for data layer abstraction and programmatic validation constraints.
  - **Frontend Interface**: Modular User Interface built utilizing native HTML5, CSS3, and asynchronous JavaScript (Fetch API).
  - **Network Infrastructure**: RESTful API endpoints handling JSON payloads across decoupled application service layers.
  - **Containerization**: Multi-stage Docker environments separating build tools from lightweight execution runtimes.
  - **DevOps Pipeline**: GitHub Actions continuous integration workflow automation targeting source compilation and backend quality gates.


### Application User Interfaces
Below are the conceptual wireframes and portal deployment layouts engineered for the respective roles:

#### Authentication Gateways
<img width="324" height="203" alt="admin portal" src="https://github.com/user-attachments/assets/8e778609-fcc0-4c7e-aede-ea7cc837bdca" />

_Figure 1: Admin portal secure gateway layout interface._

<img width="328" height="163" alt="doctor portal" src="https://github.com/user-attachments/assets/953e6fa9-12ac-4860-b600-3e34224ee39b" />

_Figure 2: Doctor portal authentication view framework._

<img width="321" height="165" alt="Patient portal" src="https://github.com/user-attachments/assets/8f34be59-c26e-4c0c-99cc-d20f9e442ee0" />

_Figure 3: Patient onboarding and login workspace interface._

#### Operational Dashboard Views
<img width="453" height="520" alt="admin adding doctor" src="https://github.com/user-attachments/assets/a057265f-502d-4042-b5f9-a8f18a7a8b52" />

_Figure 4: Admin dashboard illustrating dynamic addition of medical practitioners._

<img width="272" height="181" alt="Searching Doctor" src="https://github.com/user-attachments/assets/736bf2fe-2a7d-4a7c-bb12-8e3de58b2ae0" />

_Figure 5: Patient dashboard tracking name-based queries for registered physicians._

<img width="293" height="127" alt="Appointments List" src="https://github.com/user-attachments/assets/2d6e4d02-62f4-439c-9168-2ff0c1d93005" />

_Figure 6: Doctor scheduler view tracking registered patient appointments._

## Quantifiable Project Metrics
- **Core Entities Programmed**: 4 primary data models mapped (Admin, Doctor, Patient, Appointment) utilizing strict JPA validations.
- **Service Layers Engineered**: 3 distinct controller-to-repository microservice pipelines (DoctorService, AppointmentService, TokenService).
- **Controller Endpoints Exposed**: 3 functional REST routing controllers (DoctorController, AppointmentController, PrescriptionController) facilitating full CRUD integration.
- **Database Tables Managed**: 4 relational tables mapped inside MySQL alongside 1 document collection collection deployed inside MongoDB.
- **Stored Procedures Compiled**: 3 highly optimized reporting database scripts (GetDailyAppointmentReportByDoctor, GetDoctorWithMostPatientsByMonth, GetDoctorWithMostPatientsByYear).
- **User Portals Managed**: 3 isolated front-end UI authentication modules tailored to Doctor, Patient, and Admin security scopes.
- **Automated Workflow Steps**: 1 structural GitHub Actions yaml configuration automating project dependency resolution and Java backend compilation.

## Project Artifacts and Repository Structure
The following components are engineered and maintained across the repository layers to fulfill production design specifications:

### Core Codebase Components
- `schema-design.md`: Explicit definitions of the MySQL schemas, structural relationships, and relational integrity mapping.
- `Doctor.java` / `Appointment.java`: Structured entity models handling data layer logic and field validations.
- `DoctorController.java` / `PrescriptionController.java`: Core REST endpoints exposing platform business logic.
- `AppointmentService.java` / `DoctorService.java` / `TokenService.java`: Abstracted service components handling backend functional algorithms.
- `PatientRepository.java`: Data access tier abstraction wrapping safe database access execution logic.
- `Dockerfile`: Multi-stage compilation layer managing the final deployed runtime environment.
- `.github/workflows/main.yml`: Automated continuous integration compiler validating push pipelines.

