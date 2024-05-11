package fr.planandchill.planandchill.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ContainId implements Serializable {
    private static final long serialVersionUID = 7663831253392399266L;
    @NotNull
    @Column(name = "id_appointment", nullable = false)
    private Integer idAppointment;

    @NotNull
    @Column(name = "id_service", nullable = false)
    private Integer idService;

    public Integer getIdAppointment() {
        return idAppointment;
    }

    public void setIdAppointment(Integer idAppointment) {
        this.idAppointment = idAppointment;
    }

    public Integer getIdService() {
        return idService;
    }

    public void setIdService(Integer idService) {
        this.idService = idService;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ContainId entity = (ContainId) o;
        return Objects.equals(this.idAppointment, entity.idAppointment) &&
                Objects.equals(this.idService, entity.idService);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAppointment, idService);
    }

}