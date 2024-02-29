package com.nhnacademy.springjpa.jpahwfinal.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "certificate_issue")
public class CertificateIssue {

    @Id
    @Column(name = "certificate_confirmation_number", nullable = false)
    private Long certificateConfirmationNumber;

    @Column(name = "resident_serial_number", nullable = false, insertable = false, updatable = false)
    private Integer residentSerialNumber;

    @Column(name = "certificate_type_code", nullable = false)
    private String certificateTypeCode;

    @Column(name = "certificate_issue_date", nullable = false)
    private Date certificateIssueDate;

    @ManyToOne
    @JoinColumn(name = "resident_serial_number")
    private Resident resident;
}

