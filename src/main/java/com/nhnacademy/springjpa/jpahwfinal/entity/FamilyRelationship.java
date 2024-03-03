package com.nhnacademy.springjpa.jpahwfinal.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@IdClass(FamilyRelationship.Pk.class)
@Table(name = "family_relationship")
public class FamilyRelationship {

    @Id
    @Column(name = "base_resident_serial_number", insertable = false, updatable = false)
    private Integer baseResidentSerialNumber;

    @Id
    @Column(name = "family_resident_serial_number", insertable = false, updatable = false)
    private Integer familyResidentSerialNumber;

    @Column(name = "family_relationship_code", nullable = false)
    private String familyRelationshipCode;

    @ManyToOne
    @JoinColumn(name = "base_resident_serial_number", referencedColumnName = "resident_serial_number")
    private Resident baseResident;

    @ManyToOne
    @JoinColumn(name = "family_resident_serial_number", referencedColumnName = "resident_serial_number")
    private Resident familyResident;

    @NoArgsConstructor
    @AllArgsConstructor
    @EqualsAndHashCode
    public static class Pk implements Serializable {
        private Integer baseResidentSerialNumber;
        private Integer familyResidentSerialNumber;

    }
}
