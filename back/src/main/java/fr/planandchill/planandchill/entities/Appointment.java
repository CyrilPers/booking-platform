package fr.planandchill.planandchill.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.time.Instant;

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
    @JoinColumn(name = "id_user", nullable = false)
    private Worker idUser;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_user1", nullable = false)
    private Customer idUser1;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_apppointment_state", nullable = false)
    private AppointmentState idApppointmentState;

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

    public Worker getIdUser() {
        return idUser;
    }

    public void setIdUser(Worker idUser) {
        this.idUser = idUser;
    }

    public Customer getIdUser1() {
        return idUser1;
    }

    public void setIdUser1(Customer idUser1) {
        this.idUser1 = idUser1;
    }

    public AppointmentState getIdApppointmentState() {
        return idApppointmentState;
    }

    public void setIdApppointmentState(AppointmentState idApppointmentState) {
        this.idApppointmentState = idApppointmentState;
    }

}