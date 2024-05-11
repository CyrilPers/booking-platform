package fr.planandchill.planandchill.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "contains")
public class Contain {
    @EmbeddedId
    private ContainId id;

    @MapsId("idAppointment")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_appointment", nullable = false)
    private Appointment idAppointment;

    @MapsId("idService")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_service", nullable = false)
    private Service idService;

    public ContainId getId() {
        return id;
    }

    public void setId(ContainId id) {
        this.id = id;
    }

    public Appointment getIdAppointment() {
        return idAppointment;
    }

    public void setIdAppointment(Appointment idAppointment) {
        this.idAppointment = idAppointment;
    }

    public Service getIdService() {
        return idService;
    }

    public void setIdService(Service idService) {
        this.idService = idService;
    }

}