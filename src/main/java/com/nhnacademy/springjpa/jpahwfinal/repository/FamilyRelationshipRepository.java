package com.nhnacademy.springjpa.jpahwfinal.repository;

import com.nhnacademy.springjpa.jpahwfinal.domain.FamilyRelationshipDto;
import com.nhnacademy.springjpa.jpahwfinal.entity.FamilyRelationship;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FamilyRelationshipRepository extends JpaRepository<FamilyRelationship, FamilyRelationship.Pk> {

    List<FamilyRelationshipDto> findByBaseResidentSerialNumber(Integer baseResidentSerialNumber);


}
