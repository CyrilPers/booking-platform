package fr.planandchill.planandchill.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "region")
public class Region {
    @Id
    @Size(max = 50)
    @Column(name = "insee_region", nullable = false, length = 50)
    private String inseeRegion;

    public String getInseeRegion() {
        return inseeRegion;
    }

    public void setInseeRegion(String inseeRegion) {
        this.inseeRegion = inseeRegion;
    }

    //TODO [Reverse Engineering] generate columns from DB
}