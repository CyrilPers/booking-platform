package fr.planandchill.planandchill.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "postal_code")
public class PostalCode {
    @Id
    @Size(max = 50)
    @Column(name = "code", nullable = false, length = 50)
    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    //TODO [Reverse Engineering] generate columns from DB
}