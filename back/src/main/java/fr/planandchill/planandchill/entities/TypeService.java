package fr.planandchill.planandchill.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "type_service")
public class TypeService {
    @Id
    @Size(max = 50)
    @Column(name = "id_service_type", nullable = false, length = 50)
    private String idServiceType;

    @Size(max = 50)
    @NotNull
    @Column(name = "label", nullable = false, length = 50)
    private String label;

    @OneToMany(mappedBy = "idServiceType")
    private Set<Category> categories = new LinkedHashSet<>();

    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }

    public String getIdServiceType() {
        return idServiceType;
    }

    public void setIdServiceType(String idServiceType) {
        this.idServiceType = idServiceType;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

}