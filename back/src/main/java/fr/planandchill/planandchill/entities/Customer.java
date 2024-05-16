package fr.planandchill.planandchill.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "customer")
public class Customer extends User {

    @NotNull
    @Column(name = "advertising", nullable = false)
    private Boolean advertising = false;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getAdvertising() {
        return advertising;
    }

    public void setAdvertising(Boolean advertising) {
        this.advertising = advertising;
    }

}