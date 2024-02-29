package com.nhnacademy.springjpa.jpahwfinal.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@IdClass(BirthDeathReportResident.Pk.class)
@Table(name = "birth_death_report_resident")
public class BirthDeathReportResident {


    @Id
    @Column(name = "resident_serial_number", insertable = false, updatable = false)
    private Integer residentSerialNumber;

    @Id
    @Column(name = "birth_death_type_code", nullable = false)
    private String birthDeathTypeCode;

    @Id
    @Column(name = "report_resident_serial_number", nullable = false)
    private Integer reportResidentSerialNumber;

    @Column(name = "birth_death_report_date", nullable = false)
    private Date birthDeathReportDate;

    @Column(name = "birth_report_qualifications_code")
    private String birthReportQualificationsCode;

    @Column(name = "death_report_qualifications_code")
    private String deathReportQualificationsCode;

    @Column(name = "email_address")
    private String emailAddress;

    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;

    @ManyToOne
    @JoinColumn(name = "resident_serial_number" )
    private Resident resident;


    @NoArgsConstructor
    @AllArgsConstructor
    @EqualsAndHashCode
    public static class Pk implements Serializable {
        private Integer residentSerialNumber;
        private String birthDeathTypeCode;
        private Integer reportResidentSerialNumber;

    }

}
