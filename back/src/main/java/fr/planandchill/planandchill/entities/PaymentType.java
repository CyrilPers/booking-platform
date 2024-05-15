package fr.planandchill.planandchill.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "payment_type")
public class PaymentType {
    @Id
    @Column(name = "id_payment_type", nullable = false)
    private Integer id;

    @Size(max = 50)
    @NotNull
    @Column(name = "label", nullable = false, length = 50)
    private String label;

    @OneToMany(mappedBy = "idPaymentType")
    private Set<Payment> payments = new LinkedHashSet<>();

    public Set<Payment> getPayments() {
        return payments;
    }

    public void setPayments(Set<Payment> payments) {
        this.payments = payments;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

}