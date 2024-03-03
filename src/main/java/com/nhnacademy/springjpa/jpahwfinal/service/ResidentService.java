package com.nhnacademy.springjpa.jpahwfinal.service;

import com.nhnacademy.springjpa.jpahwfinal.domain.BirthDeathReportResidentDto;
import com.nhnacademy.springjpa.jpahwfinal.domain.FamilyRelationshipDto;
import com.nhnacademy.springjpa.jpahwfinal.entity.Resident;

import java.util.List;

public interface ResidentService {
    List<Resident> getAllResidents();

    Resident getResidents(Integer residentSerialNumber);

    List<FamilyRelationshipDto> getFamilyRelationsips(Integer baseResidentSerialNumber);

    List<BirthDeathReportResidentDto> getBirthDeathResidents(Integer baseResidentSerialNumber);
}
