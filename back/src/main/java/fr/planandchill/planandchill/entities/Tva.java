package fr.planandchill.planandchill.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "tva")
public class Tva {
    @Id
    @Column(name = "taux", nullable = false, precision = 4, scale = 2)
    private BigDecimal id;

    @OneToMany(mappedBy = "taux")
    private Set<Service> services = new LinkedHashSet<>();

    public Set<Service> getServices() {
        return services;
    }

    public void setServices(Set<Service> services) {
        this.services = services;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }
}