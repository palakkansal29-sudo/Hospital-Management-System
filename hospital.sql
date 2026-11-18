CREATE DATABASE IF NOT EXISTS hospital_management;
USE hospital_management;

CREATE TABLE IF NOT EXISTS patients (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    full_name VARCHAR(150) NOT NULL,
    date_of_birth DATE,
    gender VARCHAR(30),
    phone VARCHAR(30),
    address VARCHAR(500),
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS doctors (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    full_name VARCHAR(150) NOT NULL,
    specialization VARCHAR(120) NOT NULL,
    phone VARCHAR(30),
    email VARCHAR(254) UNIQUE,
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS appointments (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    patient_id BIGINT NOT NULL,
    doctor_id BIGINT NOT NULL,
    appointment_date DATETIME NOT NULL,
    status VARCHAR(30) NOT NULL DEFAULT 'SCHEDULED',
    notes TEXT,
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT fk_appointments_patient
        FOREIGN KEY (patient_id) REFERENCES patients(id),
    CONSTRAINT fk_appointments_doctor
        FOREIGN KEY (doctor_id) REFERENCES doctors(id),
    INDEX idx_appointments_date (appointment_date),
    INDEX idx_appointments_patient (patient_id),
    INDEX idx_appointments_doctor (doctor_id)
);

CREATE TABLE IF NOT EXISTS billing (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    appointment_id BIGINT NOT NULL UNIQUE,
    amount DECIMAL(10, 2) NOT NULL,
    billing_date DATE NOT NULL,
    status VARCHAR(30) NOT NULL DEFAULT 'UNPAID',
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT fk_billing_appointment
        FOREIGN KEY (appointment_id) REFERENCES appointments(id)
);
