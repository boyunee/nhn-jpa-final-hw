package com.nhnacademy.springjpa.jpahwfinal.service;

import com.nhnacademy.springjpa.jpahwfinal.domain.BirthDeathReportResidentDto;
import com.nhnacademy.springjpa.jpahwfinal.domain.FamilyRelationshipDto;
import com.nhnacademy.springjpa.jpahwfinal.entity.Resident;
import com.nhnacademy.springjpa.jpahwfinal.repository.BirthDeathReportResidentRepository;
import com.nhnacademy.springjpa.jpahwfinal.repository.FamilyRelationshipRepository;
import com.nhnacademy.springjpa.jpahwfinal.repository.ResidentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("residentService")
@RequiredArgsConstructor
public class ResidentServiceImpl implements ResidentService {
    private final ResidentRepository residentRepository;
    private final FamilyRelationshipRepository familyRelationshipRepository;
    private final BirthDeathReportResidentRepository birthDeathReportResidentRepository;

    @Override
    public List<Resident> getAllResidents() {
        return residentRepository.findAllBy();
    }

    @Override
    public Resident getResidents(Integer residentSerialNumber){
        return residentRepository.findAllByResidentSerialNumber(residentSerialNumber);
    }

    @Override
    public List<FamilyRelationshipDto> getFamilyRelationsips(Integer baseResidentSerialNumber) {
        return familyRelationshipRepository.findByBaseResidentSerialNumber(baseResidentSerialNumber);
    }

    @Override
    public List<BirthDeathReportResidentDto> getBirthDeathResidents(Integer baseResidentSerialNumber) {
        return birthDeathReportResidentRepository.findAllByResidentSerialNumber(baseResidentSerialNumber);
    }
}
