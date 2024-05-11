package fr.planandchill.planandchill.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class UserAddressId implements Serializable {
    private static final long serialVersionUID = 63007037826841812L;
    @NotNull
    @Column(name = "id_user", nullable = false)
    private Integer idUser;

    @NotNull
    @Column(name = "id_address", nullable = false)
    private Integer idAddress;

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public Integer getIdAddress() {
        return idAddress;
    }

    public void setIdAddress(Integer idAddress) {
        this.idAddress = idAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        UserAddressId entity = (UserAddressId) o;
        return Objects.equals(this.idUser, entity.idUser) &&
                Objects.equals(this.idAddress, entity.idAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUser, idAddress);
    }

}