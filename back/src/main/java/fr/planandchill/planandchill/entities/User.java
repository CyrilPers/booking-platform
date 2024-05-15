package fr.planandchill.planandchill.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "user")
public class User {
    @Id
    @Column(name = "id_user", nullable = false)
    private Integer id;

    @Size(max = 50)
    @NotNull
    @Column(name = "firstName", nullable = false, length = 50)
    private String firstName;

    @Size(max = 50)
    @NotNull
    @Column(name = "lastName", nullable = false, length = 50)
    private String lastName;

    @Column(name = "enabled")
    private Boolean enabled;

    @Size(max = 250)
    @NotNull
    @Column(name = "email", nullable = false, length = 250)
    private String email;

    @Size(max = 250)
    @NotNull
    @Column(name = "password", nullable = false, length = 250)
    private String password;

    @Size(max = 50)
    @Column(name = "phoneNumber", length = 50)
    private String phoneNumber;

    @ManyToMany
    @JoinTable(name = "asso_23",
            joinColumns = @JoinColumn(name = "id_user"),
            inverseJoinColumns = @JoinColumn(name = "id_address"))
    private Set<Address> addresses = new LinkedHashSet<>();

    @OneToOne(mappedBy = "idUser")
    private Customer customer;

    @OneToOne(mappedBy = "idUser")
    private Worker worker;

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Set<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}