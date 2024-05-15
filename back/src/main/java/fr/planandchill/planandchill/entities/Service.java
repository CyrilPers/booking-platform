package fr.planandchill.planandchill.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "service")
public class Service {
    @Id
    @Column(name = "id_service", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "duration", nullable = false)
    private Short duration;

    @Size(max = 250)
    @Column(name = "description", length = 250)
    private String description;

    @Size(max = 50)
    @NotNull
    @Column(name = "title", nullable = false, length = 50)
    private String title;

    @NotNull
    @Column(name = "price", nullable = false, precision = 8, scale = 2)
    private BigDecimal price;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_category", nullable = false)
    private Category idCategory;

    @ManyToMany
    @JoinTable(name = "contains",
            joinColumns = @JoinColumn(name = "id_service"),
            inverseJoinColumns = @JoinColumn(name = "id_appointment"))
    private Set<Appointment> appointments = new LinkedHashSet<>();

    @ManyToMany
    @JoinTable(name = "does",
            joinColumns = @JoinColumn(name = "id_service"),
            inverseJoinColumns = @JoinColumn(name = "id_worker"))
    private Set<Worker> workers = new LinkedHashSet<>();

    public Set<Worker> getWorkers() {
        return workers;
    }

    public void setWorkers(Set<Worker> workers) {
        this.workers = workers;
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

    public Short getDuration() {
        return duration;
    }

    public void setDuration(Short duration) {
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Category getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(Category idCategory) {
        this.idCategory = idCategory;
    }

}