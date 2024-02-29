package com.nhnacademy.springjpa.jpahwfinal.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "household")
public class Household {

    @Id
    @Column(name = "household_serial_number", nullable = false)
    private Integer householdSerialNumber;

    @Column(name = "household_resident_serial_number", nullable = false)
    private Integer householdResidentSerialNumber;

    @Column(name = "household_composition_date", nullable = false)
    private Date householdCompositionDate;

    @Column(name = "household_composition_reason_code", nullable = false)
    private String householdCompositionReasonCode;

    @Column(name = "current_house_movement_address", nullable = false)
    private String currentHouseMovementAddress;

    @ManyToOne
    @JoinColumn(name = "resident_serial_number")
    private Resident resident;

    @OneToMany(mappedBy = "household")
    private List<HouseholdCompositionResident> householdCompositionResidents;

    @OneToMany(mappedBy = "household")
    private  List<HouseholdMovementAddress> householdMovementAddresses;
}
