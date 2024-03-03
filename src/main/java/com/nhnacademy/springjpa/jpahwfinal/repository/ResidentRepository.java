package com.nhnacademy.springjpa.jpahwfinal.repository;

import com.nhnacademy.springjpa.jpahwfinal.entity.Resident;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ResidentRepository extends JpaRepository<Resident, Integer> {

    List<Resident> findAllBy();

    Resident findAllByResidentSerialNumber(Integer residentSerialNumber);



}
