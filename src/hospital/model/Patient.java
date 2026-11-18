package hospital.model;

import java.time.LocalDate;

public class Patient {
    private long id;
    private String fullName;
    private LocalDate dateOfBirth;
    private String gender;
    private String phone;
    private String address;

    public Patient() {
    }

    public Patient(long id, String fullName, LocalDate dateOfBirth, String gender, String phone, String address) {
        this.id = id;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
    }

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }
    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    public LocalDate getDateOfBirth() { return dateOfBirth; }
    public void setDateOfBirth(LocalDate dateOfBirth) { this.dateOfBirth = dateOfBirth; }
    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
}
