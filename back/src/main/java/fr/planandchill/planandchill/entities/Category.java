package fr.planandchill.planandchill.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "category")
public class Category {
    @Id
    @Column(name = "id_category", nullable = false)
    private Integer id;

    @Size(max = 50)
    @NotNull
    @Column(name = "label", nullable = false, length = 50)
    private String label;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_company", nullable = false)
    private Company idCompany;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_service_type", nullable = false)
    private TypeService idServiceType;

    @OneToMany(mappedBy = "idCategory")
    private Set<Service> services = new LinkedHashSet<>();

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

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Company getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(Company idCompany) {
        this.idCompany = idCompany;
    }

    public TypeService getIdServiceType() {
        return idServiceType;
    }

    public void setIdServiceType(TypeService idServiceType) {
        this.idServiceType = idServiceType;
    }

}