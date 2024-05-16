package fr.planandchill.planandchill.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "worker")
public class Worker {
    @Id
    @Column(name = "id_worker", nullable = false)
    private Integer id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_company", nullable = false)
    private Company idCompany;

    @NotNull
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_user", nullable = false)
    private User idUser;

    @OneToMany(mappedBy = "idWorker")
    private Set<Appointment> appointments = new LinkedHashSet<>();

    @ManyToMany
    @JoinTable(name = "asso_28",
            joinColumns = @JoinColumn(name = "id_worker"),
            inverseJoinColumns = @JoinColumn(name = "id_permissions_level"))
    private Set<PermissionsLevel> permissionsLevels = new LinkedHashSet<>();

    @ManyToMany
    @JoinTable(name = "does",
            joinColumns = @JoinColumn(name = "id_worker"),
            inverseJoinColumns = @JoinColumn(name = "id_service"))
    private Set<Service> services = new LinkedHashSet<>();

    @OneToMany(mappedBy = "idWorker")
    private Set<Planning> plannings = new LinkedHashSet<>();

    public Set<Planning> getPlannings() {
        return plannings;
    }

    public void setPlannings(Set<Planning> plannings) {
        this.plannings = plannings;
    }

    public Set<Service> getServices() {
        return services;
    }

    public void setServices(Set<Service> services) {
        this.services = services;
    }

    public Set<PermissionsLevel> getPermissionsLevels() {
        return permissionsLevels;
    }

    public void setPermissionsLevels(Set<PermissionsLevel> permissionsLevels) {
        this.permissionsLevels = permissionsLevels;
    }

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

    public Company getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(Company idCompany) {
        this.idCompany = idCompany;
    }

    public User getIdUser() {
        return idUser;
    }

    public void setIdUser(User idUser) {
        this.idUser = idUser;
    }

}