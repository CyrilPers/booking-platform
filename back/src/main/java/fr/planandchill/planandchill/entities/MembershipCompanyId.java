package fr.planandchill.planandchill.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class MembershipCompanyId implements Serializable {
    private static final long serialVersionUID = -4955628595740721985L;
    @Size(max = 50)
    @NotNull
    @Column(name = "id_company", nullable = false, length = 50)
    private String idCompany;

    @NotNull
    @Column(name = "id_membership", nullable = false)
    private Integer idMembership;

    public String getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(String idCompany) {
        this.idCompany = idCompany;
    }

    public Integer getIdMembership() {
        return idMembership;
    }

    public void setIdMembership(Integer idMembership) {
        this.idMembership = idMembership;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        MembershipCompanyId entity = (MembershipCompanyId) o;
        return Objects.equals(this.idMembership, entity.idMembership) &&
                Objects.equals(this.idCompany, entity.idCompany);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idMembership, idCompany);
    }

}