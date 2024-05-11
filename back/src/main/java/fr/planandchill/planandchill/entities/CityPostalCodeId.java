package fr.planandchill.planandchill.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class CityPostalCodeId implements Serializable {
    private static final long serialVersionUID = 149557144119226448L;
    @NotNull
    @Column(name = "insee_city", nullable = false)
    private Integer inseeCity;

    @Size(max = 50)
    @NotNull
    @Column(name = "code", nullable = false, length = 50)
    private String code;

    public Integer getInseeCity() {
        return inseeCity;
    }

    public void setInseeCity(Integer inseeCity) {
        this.inseeCity = inseeCity;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        CityPostalCodeId entity = (CityPostalCodeId) o;
        return Objects.equals(this.inseeCity, entity.inseeCity) &&
                Objects.equals(this.code, entity.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inseeCity, code);
    }

}