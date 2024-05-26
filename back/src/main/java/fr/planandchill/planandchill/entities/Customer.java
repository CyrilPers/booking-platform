package fr.planandchill.planandchill.entities;

import fr.planandchill.planandchill.user.User;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@DiscriminatorValue("customer")
public class Customer extends User {

    @NotNull
    @Column(name = "advertising", nullable = false)
    private Boolean advertising = false;

    @OneToOne
    @JoinColumn(name = "id_user")
    private User user;

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