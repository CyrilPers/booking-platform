package fr.planandchill.planandchill.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "postal_code")
public class PostalCode {
    @Id
    @Size(max = 50)
    @Column(name = "code", nullable = false, length = 50)
    private String code;

    @ManyToMany
    @JoinTable(name = "has",
            joinColumns = @JoinColumn(name = "code"),
            inverseJoinColumns = @JoinColumn(name = "insee_city"))
    private Set<City> cities = new LinkedHashSet<>();

    public Set<City> getCities() {
        return cities;
    }

    public void setCities(Set<City> cities) {
        this.cities = cities;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    //TODO [Reverse Engineering] generate columns from DB
}