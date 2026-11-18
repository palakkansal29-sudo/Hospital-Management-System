package hospital.model;

import java.time.LocalDateTime;

public class Appointment {
    private long id;
    private long patientId;
    private long doctorId;
    private LocalDateTime appointmentDate;
    private String status;
    private String notes;

    public Appointment() {
    }

    public Appointment(long id, long patientId, long doctorId, LocalDateTime appointmentDate, String status, String notes) {
        this.id = id;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.appointmentDate = appointmentDate;
        this.status = status;
        this.notes = notes;
    }

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }
    public long getPatientId() { return patientId; }
    public void setPatientId(long patientId) { this.patientId = patientId; }
    public long getDoctorId() { return doctorId; }
    public void setDoctorId(long doctorId) { this.doctorId = doctorId; }
    public LocalDateTime getAppointmentDate() { return appointmentDate; }
    public void setAppointmentDate(LocalDateTime appointmentDate) { this.appointmentDate = appointmentDate; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public String getNotes() { return notes; }
    public void setNotes(String notes) { this.notes = notes; }
}
