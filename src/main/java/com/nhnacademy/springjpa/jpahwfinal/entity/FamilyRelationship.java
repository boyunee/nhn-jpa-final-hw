package com.nhnacademy.springjpa.jpahwfinal.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@IdClass(FamilyRelationship.Pk.class)
@Table(name = "famil_relationship")
public class FamilyRelationship {

    @Id
    @Column(name = "base_resident_serial_number")
    private Integer baseResidentSerialNumber;

    @Id
    @Column(name = "family_resident_serial_number")
    private Integer familyResidentSerialNumber;

    @Column(name = "family_relationship_code", nullable = false)
    private String familyRelationshipCode;

    @ManyToOne
    @JoinColumn(name = "resident_serial_number")
    private Resident resident;

    @NoArgsConstructor
    @AllArgsConstructor
    @EqualsAndHashCode
    public static class Pk implements Serializable {
        private Integer baseResidentSerialNumber;
        private Integer familyResidentSerialNumber;

    }
}
