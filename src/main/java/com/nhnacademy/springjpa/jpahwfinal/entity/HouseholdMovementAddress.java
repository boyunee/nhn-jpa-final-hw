package com.nhnacademy.springjpa.jpahwfinal.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@IdClass(HouseholdMovementAddress.Pk.class)
@Table(name = "household_movement_address")
public class HouseholdMovementAddress {


    @Id
    @Column(name = "household_serial_number", nullable = false, insertable = false, updatable = false)
    private Integer householdSerialNumber;

    @Id
    @Column(name = "house_movement_report_date", nullable = false)
    private Date houseMovementReportDate;

    @Column(name = "last_address_yn", nullable = false)
    private String lastAddressYn;

    @ManyToOne
    @JoinColumn(name = "household_serial_number")
    private Household household;

    @NoArgsConstructor
    @AllArgsConstructor
    @EqualsAndHashCode
    public static class Pk implements Serializable {

        private Integer householdSerialNumber;

        private Date houseMovementReportDate;

    }

}

