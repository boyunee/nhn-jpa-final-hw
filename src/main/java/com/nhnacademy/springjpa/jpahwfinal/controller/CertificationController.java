package com.nhnacademy.springjpa.jpahwfinal.controller;

import com.nhnacademy.springjpa.jpahwfinal.domain.BirthDeathReportResidentDto;
import com.nhnacademy.springjpa.jpahwfinal.domain.FamilyRelationshipDto;
import com.nhnacademy.springjpa.jpahwfinal.entity.Resident;
import com.nhnacademy.springjpa.jpahwfinal.exception.ResidentNotFoundException;
import com.nhnacademy.springjpa.jpahwfinal.service.ResidentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Objects;

@Controller
@RequiredArgsConstructor
public class CertificationController {
    private final ResidentService residentService;

    @ModelAttribute("residents")
    public Resident getResidents(@PathVariable("residentSerialNumber")Integer residentSerialNumber) {
        Resident resident = residentService.getResidents(residentSerialNumber);
        if (Objects.isNull(resident)) {
            throw new ResidentNotFoundException();
        }
        return resident;
    }

    @GetMapping("/familyRelationCertification/{residentSerialNumber}")
    public String viewFamilyRelationCertification(@ModelAttribute("residents") Resident resident, Model model) {
        List<FamilyRelationshipDto> familyRelationsips = residentService.getFamilyRelationsips(resident.getResidentSerialNumber());
        model.addAttribute("familyRelationsips", familyRelationsips);

        FamilyRelationshipDto.ResidentDto baseResidentDto = residentService.getFamilyRelationsips(resident.getResidentSerialNumber()).get(0).getBaseResident().get(0);
        model.addAttribute("baseResidentDto", baseResidentDto);

        FamilyRelationshipDto.CertificateIssueDto certificateIssueDto = baseResidentDto.getCertificateIssues().get(0);
        model.addAttribute("certificateIssueDto", certificateIssueDto);


        return "familyRelationCertification";
    }

    @GetMapping("/birthReporter/{residentSerialNumber}")
    public String viewBirthReporter(@ModelAttribute("residents") Resident resident, Model model) {

        List<BirthDeathReportResidentDto> birthDeathResidents = residentService.getBirthDeathResidents(resident.getResidentSerialNumber());
        model.addAttribute("birthDeathResidents", birthDeathResidents);
        return "birthReporter";
    }
}
