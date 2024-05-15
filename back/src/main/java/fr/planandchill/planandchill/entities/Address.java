package fr.planandchill.planandchill.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "address")
public class Address {
    @Id
    @Column(name = "id_address", nullable = false)
    private Integer id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "insee_country", nullable = false)
    private Country inseeCountry;

    @ManyToMany
    @JoinTable(name = "asso_23",
            joinColumns = @JoinColumn(name = "id_address"),
            inverseJoinColumns = @JoinColumn(name = "id_user"))
    private Set<User> users = new LinkedHashSet<>();

    @OneToMany(mappedBy = "idAddress")
    private Set<Company> companies = new LinkedHashSet<>();

    public Set<Company> getCompanies() {
        return companies;
    }

    public void setCompanies(Set<Company> companies) {
        this.companies = companies;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Country getInseeCountry() {
        return inseeCountry;
    }

    public void setInseeCountry(Country inseeCountry) {
        this.inseeCountry = inseeCountry;
    }

}