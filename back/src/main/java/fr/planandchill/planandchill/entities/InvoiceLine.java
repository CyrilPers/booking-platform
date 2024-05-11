package fr.planandchill.planandchill.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;

@Entity
@Table(name = "invoice_line")
public class InvoiceLine {
    @Id
    @Column(name = "id_invoice_line", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "product_price", nullable = false, precision = 8, scale = 2)
    private BigDecimal productPrice;

    @Size(max = 50)
    @NotNull
    @Column(name = "product_name", nullable = false, length = 50)
    private String productName;

    @NotNull
    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_invoice", nullable = false)
    private Invoice idInvoice;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Invoice getIdInvoice() {
        return idInvoice;
    }

    public void setIdInvoice(Invoice idInvoice) {
        this.idInvoice = idInvoice;
    }

}