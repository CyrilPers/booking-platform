package fr.planandchill.planandchill.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

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