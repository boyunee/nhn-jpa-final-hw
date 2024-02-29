package com.nhnacademy.springjpa.jpahwfinal.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.repository.Temporal;

import javax.persistence.*;
import java.rmi.UnmarshalException;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "resident")
public class Resident {

    @Id
    @Column(name = "resident_serial_number")
    private Integer residentSerialNumber;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "resident_registration_number", nullable = false)
    private String residentRegistrationNumber;

    @Column(name = "gender_code", nullable = false)
    private String genderCode;

    @Column(name = "birth_date", nullable = false)
    private LocalDateTime birthDate;

    @Column(name = "birth_place_code", nullable = false)
    private String birthPlaceCode;

    @Column(name = "registration_base_address", nullable = false)
    private String registrationBaseAddress;

    @Column(name = "death_date")
    private LocalDateTime deathDate;

    @Column(name = "death_place_code")
    private String deathPlaceCode;

    @Column(name = "death_place_address")
    private String deathPlaceAddress;


    @OneToMany(mappedBy = "resident")
    private List<BirthDeathReportResident> birthDeathReportResidents;

    @OneToMany(mappedBy = "resident")
    private List<FamilyRelationship> familyRelationships;

    @OneToMany(mappedBy = "resident")
    private List<CertificateIssue> certificateIssues;

    @OneToMany(mappedBy = "resident")
    private List<HouseholdCompositionResident> householdCompositionResidents;

    @OneToMany(mappedBy = "resident")
    private List<Household> households;

}
