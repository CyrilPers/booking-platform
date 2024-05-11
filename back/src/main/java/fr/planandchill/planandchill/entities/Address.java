package fr.planandchill.planandchill.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "address")
public class Address {
    @Id
    @Column(name = "id_address", nullable = false)
    private Integer id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "insee_country", nullable = false)
    private Country inseeCountry;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Country getInseeCountry() {
        return inseeCountry;
    }

    public void setInseeCountry(Country inseeCountry) {
        this.inseeCountry = inseeCountry;
    }

}