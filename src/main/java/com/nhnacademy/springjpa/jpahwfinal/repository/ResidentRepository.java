package com.nhnacademy.springjpa.jpahwfinal.repository;

import com.nhnacademy.springjpa.jpahwfinal.entity.Resident;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResidentRepository extends JpaRepository<Resident, Integer> {

}
