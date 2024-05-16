package fr.planandchill.planandchill.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "tva")
public class Tva {
    @Id
    @Column(name = "taux", nullable = false, precision = 4, scale = 2)
    private BigDecimal id;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    //TODO [Reverse Engineering] generate columns from DB
}