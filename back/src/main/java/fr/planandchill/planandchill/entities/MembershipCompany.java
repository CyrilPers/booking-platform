package fr.planandchill.planandchill.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.time.Instant;

@Entity
@Table(name = "subscribe")
public class MembershipCompany {
    @EmbeddedId
    private MembershipCompanyId id;

    @MapsId("idCompany")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_company", nullable = false)
    private Company idCompany;

    @MapsId("idMembership")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_membership", nullable = false)
    private Membership idMembership;

    @NotNull
    @Column(name = "date_start", nullable = false)
    private Instant dateStart;

    @Column(name = "date_end")
    private Instant dateEnd;

    public MembershipCompanyId getId() {
        return id;
    }

    public void setId(MembershipCompanyId id) {
        this.id = id;
    }

    public Company getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(Company idCompany) {
        this.idCompany = idCompany;
    }

    public Membership getIdMembership() {
        return idMembership;
    }

    public void setIdMembership(Membership idMembership) {
        this.idMembership = idMembership;
    }

    public Instant getDateStart() {
        return dateStart;
    }

    public void setDateStart(Instant dateStart) {
        this.dateStart = dateStart;
    }

    public Instant getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Instant dateEnd) {
        this.dateEnd = dateEnd;
    }

}