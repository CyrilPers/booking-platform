package fr.planandchill.planandchill.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "country")
public class Country {
    @Id
    @Column(name = "insee_country", nullable = false)
    private Integer id;

    @Size(max = 50)
    @Column(name = "label", length = 50)
    private String label;

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