package hospital.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Billing {
    private long id;
    private long appointmentId;
    private BigDecimal amount;
    private LocalDate billingDate;
    private String status;

    public Billing() {
    }

    public Billing(long id, long appointmentId, BigDecimal amount, LocalDate billingDate, String status) {
        this.id = id;
        this.appointmentId = appointmentId;
        this.amount = amount;
        this.billingDate = billingDate;
        this.status = status;
    }

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }
    public long getAppointmentId() { return appointmentId; }
    public void setAppointmentId(long appointmentId) { this.appointmentId = appointmentId; }
    public BigDecimal getAmount() { return amount; }
    public void setAmount(BigDecimal amount) { this.amount = amount; }
    public LocalDate getBillingDate() { return billingDate; }
    public void setBillingDate(LocalDate billingDate) { this.billingDate = billingDate; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
