package com.nhnacademy.springjpa.jpahwfinal.entity;

import lombok.*;

import javax.annotation.security.DenyAll;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.NavigableMap;

@Entity
@Getter
@Setter
@NoArgsConstructor
@IdClass(HouseholdCompositionResident.Pk.class)
@Table(name = "household_composition_resident")
public class HouseholdCompositionResident {

    @Id
    @Column(name = "household_serial_number", nullable = false, insertable = false, updatable = false)
    private Integer householdSerialNumber;

    @Id
    @Column(name = "resident_serial_number", nullable = false, insertable = false, updatable = false)
    private Integer residentSerialNumber;

    @Column(name = "report_date", nullable = false)
    private Date reportDate;

    @Column(name = "household_relationship_code")
    private String householdRelationshipCode;

    @Column(name = "household_composition_change_reason_code", nullable = false)
    private String householdCompositionChangeReasonCode;

    @ManyToOne
    @JoinColumn(name = "resident_serial_number")
    private Resident resident;

    @ManyToOne
    @JoinColumn(name = "household_serial_number")
    private Household household;

    @NoArgsConstructor
    @AllArgsConstructor
    @EqualsAndHashCode
    public static class Pk implements Serializable {

        private Integer householdSerialNumber;

        private Integer residentSerialNumber;

    }

}


