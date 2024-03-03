package com.nhnacademy.springjpa.jpahwfinal.controller;

import com.nhnacademy.springjpa.jpahwfinal.entity.Resident;
import com.nhnacademy.springjpa.jpahwfinal.service.ResidentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class HomeController {

    private final ResidentService residentService;

    @GetMapping("/")
    public String viewResidentList(Model model){

        List<Resident> residentList = residentService.getAllResidents();
        model.addAttribute("residentList", residentList);


        return "residentList";
    }
}
