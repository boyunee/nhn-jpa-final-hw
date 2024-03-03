package com.nhnacademy.springjpa.jpahwfinal.domain;

import com.nhnacademy.springjpa.jpahwfinal.entity.CertificateIssue;
import com.nhnacademy.springjpa.jpahwfinal.entity.Resident;
import com.nhnacademy.springjpa.jpahwfinal.service.ResidentService;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public interface FamilyRelationshipDto {
    List<ResidentDto> getBaseResident();

    List<ResidentDto> getFamilyResident();


    String getFamilyRelationshipCode();
    public interface ResidentDto {
        String getName();

        String getResidentRegistrationNumber();

        String getGenderCode();

        LocalDateTime getBirthDate();

        String getBirthPlaceCode();

        String getRegistrationBaseAddress();

        List<CertificateIssueDto> getCertificateIssues();

        List<FamilyRelationshipDto> getFamilyRelationships();
    }
    public interface CertificateIssueDto {

        Long getCertificateConfirmationNumber();

        @DateTimeFormat(pattern = "yyyy-MM-dd")
        Date getCertificateIssueDate();
    }

}