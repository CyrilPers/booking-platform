package fr.planandchill.planandchill.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "city")
public class City {
    @Id
    @Column(name = "insee_city", nullable = false)
    private Integer id;

    @Size(max = 50)
    @NotNull
    @Column(name = "label", nullable = false, length = 50)
    private String label;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "insee_county", nullable = false)
    private County inseeCounty;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "insee_country", nullable = false)
    private Country inseeCountry;

    @ManyToMany
    @JoinTable(name = "has",
            joinColumns = @JoinColumn(name = "insee_city"),
            inverseJoinColumns = @JoinColumn(name = "code"))
    private Set<PostalCode> postalCodes = new LinkedHashSet<>();

    public Set<PostalCode> getPostalCodes() {
        return postalCodes;
    }

    public void setPostalCodes(Set<PostalCode> postalCodes) {
        this.postalCodes = postalCodes;
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

    public County getInseeCounty() {
        return inseeCounty;
    }

    public void setInseeCounty(County inseeCounty) {
        this.inseeCounty = inseeCounty;
    }

    public Country getInseeCountry() {
        return inseeCountry;
    }

    public void setInseeCountry(Country inseeCountry) {
        this.inseeCountry = inseeCountry;
    }

}