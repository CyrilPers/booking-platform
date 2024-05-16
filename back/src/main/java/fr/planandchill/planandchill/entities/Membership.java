package fr.planandchill.planandchill.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "membership")
public class Membership {
    @Id
    @Column(name = "id_membership", nullable = false)
    private Integer id;

    @Size(max = 50)
    @NotNull
    @Column(name = "label", nullable = false, length = 50)
    private String label;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_payment")
    private Payment idPayment;

    @OneToMany(mappedBy = "idMembership")
    private Set<Subscribe> subscribes = new LinkedHashSet<>();

    public Set<Subscribe> getSubscribes() {
        return subscribes;
    }

    public void setSubscribes(Set<Subscribe> subscribes) {
        this.subscribes = subscribes;
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

    public Payment getIdPayment() {
        return idPayment;
    }

    public void setIdPayment(Payment idPayment) {
        this.idPayment = idPayment;
    }

}