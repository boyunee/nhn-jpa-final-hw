package com.nhnacademy.springjpa.jpahwfinal.repository;

import com.nhnacademy.springjpa.jpahwfinal.domain.BirthDeathReportResidentDto;
import com.nhnacademy.springjpa.jpahwfinal.entity.BirthDeathReportResident;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BirthDeathReportResidentRepository extends JpaRepository<BirthDeathReportResident, BirthDeathReportResident.Pk> {
    List<BirthDeathReportResidentDto> findAllByResidentSerialNumber(Integer baseResidentSerialNumber);
}
