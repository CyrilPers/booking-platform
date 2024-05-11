package fr.planandchill.planandchill.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class WorkerServiceId implements Serializable {
    private static final long serialVersionUID = 3771930230922422390L;
    @NotNull
    @Column(name = "id_worker", nullable = false)
    private Integer idWorker;

    @NotNull
    @Column(name = "id_service", nullable = false)
    private Integer idService;

    public Integer getIdWorker() {
        return idWorker;
    }

    public void setIdWorker(Integer idWorker) {
        this.idWorker = idWorker;
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
        WorkerServiceId entity = (WorkerServiceId) o;
        return Objects.equals(this.idWorker, entity.idWorker) &&
                Objects.equals(this.idService, entity.idService);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idWorker, idService);
    }

}