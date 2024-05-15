package fr.planandchill.planandchill.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @Column(name = "id_customer", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "advertising", nullable = false)
    private Boolean advertising = false;

    @NotNull
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_user", nullable = false)
    private User idUser;

    @OneToMany(mappedBy = "idCustomer")
    private Set<Appointment> appointments = new LinkedHashSet<>();

    public Set<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(Set<Appointment> appointments) {
        this.appointments = appointments;
    }

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

    public User getIdUser() {
        return idUser;
    }

    public void setIdUser(User idUser) {
        this.idUser = idUser;
    }

}