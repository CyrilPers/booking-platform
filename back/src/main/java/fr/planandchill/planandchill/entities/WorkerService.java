package fr.planandchill.planandchill.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "worker_service")
public class WorkerService {
    @EmbeddedId
    private WorkerServiceId id;

    @MapsId("idWorker")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_worker", nullable = false)
    private Worker idWorker;

    @MapsId("idService")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_service", nullable = false)
    private Service idService;

    public WorkerServiceId getId() {
        return id;
    }

    public void setId(WorkerServiceId id) {
        this.id = id;
    }

    public Worker getIdWorker() {
        return idWorker;
    }

    public void setIdWorker(Worker idWorker) {
        this.idWorker = idWorker;
    }

    public Service getIdService() {
        return idService;
    }

    public void setIdService(Service idService) {
        this.idService = idService;
    }

}