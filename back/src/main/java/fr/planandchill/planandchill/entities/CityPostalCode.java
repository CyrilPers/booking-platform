package fr.planandchill.planandchill.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "city_postal_code")
public class CityPostalCode {
    @EmbeddedId
    private CityPostalCodeId id;

    @MapsId("inseeCity")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "insee_city", nullable = false)
    private City inseeCity;

    @MapsId("code")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "code", nullable = false)
    private PostalCode code;

    public CityPostalCodeId getId() {
        return id;
    }

    public void setId(CityPostalCodeId id) {
        this.id = id;
    }

    public City getInseeCity() {
        return inseeCity;
    }

    public void setInseeCity(City inseeCity) {
        this.inseeCity = inseeCity;
    }

    public PostalCode getCode() {
        return code;
    }

    public void setCode(PostalCode code) {
        this.code = code;
    }

}