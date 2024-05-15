package fr.planandchill.planandchill.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

@Entity
@Table(name = "payment")
public class Payment {
    @Id
    @Column(name = "id_payment", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "amount", nullable = false, precision = 8, scale = 2)
    private BigDecimal amount;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_appointment", nullable = false)
    private Appointment idAppointment;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_payment_type", nullable = false)
    private PaymentType idPaymentType;

    @OneToOne(mappedBy = "idPayment")
    private Invoice invoice;

    @OneToOne(mappedBy = "idPayment")
    private Membership membership;

    public Membership getMembership() {
        return membership;
    }

    public void setMembership(Membership membership) {
        this.membership = membership;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Appointment getIdAppointment() {
        return idAppointment;
    }

    public void setIdAppointment(Appointment idAppointment) {
        this.idAppointment = idAppointment;
    }

    public PaymentType getIdPaymentType() {
        return idPaymentType;
    }

    public void setIdPaymentType(PaymentType idPaymentType) {
        this.idPaymentType = idPaymentType;
    }

}