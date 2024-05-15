package fr.planandchill.planandchill.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "invoice")
public class Invoice {
    @Id
    @Column(name = "id_invoice", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "invoice_date", nullable = false)
    private Instant invoiceDate;

    @NotNull
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_payment", nullable = false)
    private Payment idPayment;

    @OneToMany(mappedBy = "idInvoice")
    private Set<InvoiceLine> invoiceLines = new LinkedHashSet<>();

    public Set<InvoiceLine> getInvoiceLines() {
        return invoiceLines;
    }

    public void setInvoiceLines(Set<InvoiceLine> invoiceLines) {
        this.invoiceLines = invoiceLines;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Instant getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Instant invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public Payment getIdPayment() {
        return idPayment;
    }

    public void setIdPayment(Payment idPayment) {
        this.idPayment = idPayment;
    }

}