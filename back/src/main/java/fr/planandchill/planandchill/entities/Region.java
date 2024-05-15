package fr.planandchill.planandchill.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "region")
public class Region {
    @Id
    @Size(max = 50)
    @Column(name = "insee_region", nullable = false, length = 50)
    private String inseeRegion;

    @OneToMany(mappedBy = "inseeRegion")
    private Set<County> counties = new LinkedHashSet<>();

    public Set<County> getCounties() {
        return counties;
    }

    public void setCounties(Set<County> counties) {
        this.counties = counties;
    }

    public String getInseeRegion() {
        return inseeRegion;
    }

    public void setInseeRegion(String inseeRegion) {
        this.inseeRegion = inseeRegion;
    }

    //TODO [Reverse Engineering] generate columns from DB
}