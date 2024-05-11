package fr.planandchill.planandchill.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "company")
public class Company {
    @Id
    @Size(max = 50)
    @Column(name = "id_company", nullable = false, length = 50)
    private String idCompany;

    @Size(max = 50)
    @NotNull
    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Size(max = 250)
    @Column(name = "description", length = 250)
    private String description;

    @Column(name = "siret")
    private Integer siret;

    @Column(name = "text_message_balance")
    private Integer textMessageBalance;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_address", nullable = false)
    private Address idAddress;

    public String getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(String idCompany) {
        this.idCompany = idCompany;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getSiret() {
        return siret;
    }

    public void setSiret(Integer siret) {
        this.siret = siret;
    }

    public Integer getTextMessageBalance() {
        return textMessageBalance;
    }

    public void setTextMessageBalance(Integer textMessageBalance) {
        this.textMessageBalance = textMessageBalance;
    }

    public Address getIdAddress() {
        return idAddress;
    }

    public void setIdAddress(Address idAddress) {
        this.idAddress = idAddress;
    }

}