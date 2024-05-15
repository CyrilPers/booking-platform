package fr.planandchill.planandchill.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "county")
public class County {
    @Id
    @Column(name = "insee_county", nullable = false)
    private Integer id;

    @Size(max = 50)
    @NotNull
    @Column(name = "label", nullable = false, length = 50)
    private String label;

    @Column(name = "number")
    private Integer number;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "insee_region", nullable = false)
    private Region inseeRegion;

    @OneToMany(mappedBy = "inseeCounty")
    private Set<City> cities = new LinkedHashSet<>();

    public Set<City> getCities() {
        return cities;
    }

    public void setCities(Set<City> cities) {
        this.cities = cities;
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

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Region getInseeRegion() {
        return inseeRegion;
    }

    public void setInseeRegion(Region inseeRegion) {
        this.inseeRegion = inseeRegion;
    }

}