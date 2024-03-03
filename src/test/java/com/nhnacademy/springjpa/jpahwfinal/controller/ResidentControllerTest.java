package com.nhnacademy.springjpa.jpahwfinal.controller;

import com.nhnacademy.springjpa.jpahwfinal.config.RootConfig;
import com.nhnacademy.springjpa.jpahwfinal.config.WebConfig;
import com.nhnacademy.springjpa.jpahwfinal.domain.FamilyRelationshipDto;
import com.nhnacademy.springjpa.jpahwfinal.service.ResidentService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@ExtendWith(SpringExtension.class)
@WebAppConfiguration
@Transactional
@ContextHierarchy({
        @ContextConfiguration(classes = RootConfig.class),
        @ContextConfiguration(classes = WebConfig.class)
})
class ResidentControllerTest {

    @Autowired
    private ResidentService residentService;



    @Test
    void viewFamilyRelationCertification() {
        List<FamilyRelationshipDto> familyRelationsips = residentService.getFamilyRelationsips(4);



        Assertions.assertThat(familyRelationsips.get(0).getBaseResident().get(0).getName()).isEqualTo("남기준");

        Timestamp timestamp = Timestamp.valueOf("2021-10-25 00:00:00.000");
        Assertions.assertThat(familyRelationsips.get(0).getBaseResident().get(0).getCertificateIssues().get(0).getCertificateIssueDate()).isEqualTo(timestamp);


        Assertions.assertThat(familyRelationsips.get(0).getFamilyResident().get(0).getName()).isEqualTo("남석환");
    }
}