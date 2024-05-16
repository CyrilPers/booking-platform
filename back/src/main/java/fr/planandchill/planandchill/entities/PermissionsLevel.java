package fr.planandchill.planandchill.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "permissions_level")
public class PermissionsLevel {
    @Id
    @Column(name = "id_permissions_level", nullable = false)
    private Integer id;

    @Size(max = 50)
    @NotNull
    @Column(name = "label", nullable = false, length = 50)
    private String label;

    @ManyToMany
    @JoinTable(name = "asso_28",
            joinColumns = @JoinColumn(name = "id_permissions_level"),
            inverseJoinColumns = @JoinColumn(name = "id_worker"))
    private Set<Worker> workers = new LinkedHashSet<>();

    public Set<Worker> getWorkers() {
        return workers;
    }

    public void setWorkers(Set<Worker> workers) {
        this.workers = workers;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

}