package fr.planandchill.planandchill.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "appointment")
public class Appointment {
    @Id
    @Column(name = "id_appointment", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "date_start", nullable = false)
    private Instant dateStart;

    @NotNull
    @Column(name = "date_end", nullable = false)
    private Instant dateEnd;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_worker", nullable = false)
    private Worker idWorker;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_customer", nullable = false)
    private Customer idCustomer;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_apppointment_state", nullable = false)
    private AppointmentState idApppointmentState;

    @ManyToMany
    @JoinTable(name = "contains",
            joinColumns = @JoinColumn(name = "id_appointment"),
            inverseJoinColumns = @JoinColumn(name = "id_service"))
    private Set<Service> services = new LinkedHashSet<>();

    @OneToMany(mappedBy = "idAppointment")
    private Set<Payment> payments = new LinkedHashSet<>();

    public Set<Payment> getPayments() {
        return payments;
    }

    public void setPayments(Set<Payment> payments) {
        this.payments = payments;
    }

    public Set<Service> getServices() {
        return services;
    }

    public void setServices(Set<Service> services) {
        this.services = services;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Instant getDateStart() {
        return dateStart;
    }

    public void setDateStart(Instant dateStart) {
        this.dateStart = dateStart;
    }

    public Instant getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Instant dateEnd) {
        this.dateEnd = dateEnd;
    }

    public Worker getIdWorker() {
        return idWorker;
    }

    public void setIdWorker(Worker idWorker) {
        this.idWorker = idWorker;
    }

    public Customer getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Customer idCustomer) {
        this.idCustomer = idCustomer;
    }

    public AppointmentState getIdApppointmentState() {
        return idApppointmentState;
    }

    public void setIdApppointmentState(AppointmentState idApppointmentState) {
        this.idApppointmentState = idApppointmentState;
    }

}