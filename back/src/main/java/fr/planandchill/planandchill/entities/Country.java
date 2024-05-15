package fr.planandchill.planandchill.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "country")
public class Country {
    @Id
    @Column(name = "insee_country", nullable = false)
    private Integer id;

    @Size(max = 50)
    @Column(name = "label", length = 50)
    private String label;

    @OneToMany(mappedBy = "inseeCountry")
    private Set<Address> addresses = new LinkedHashSet<>();

    @OneToMany(mappedBy = "inseeCountry")
    private Set<City> cities = new LinkedHashSet<>();

    public Set<City> getCities() {
        return cities;
    }

    public void setCities(Set<City> cities) {
        this.cities = cities;
    }

    public Set<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
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