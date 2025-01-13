package com.example.calendrier_familiale_api.controller;


import com.example.calendrier_familiale_api.model.Family;
import com.example.calendrier_familiale_api.service.FamilyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/families")
public class FamilyController {
    @Autowired
    private FamilyService familyService;

    @PostMapping("/create")
    public void createFamily(@RequestBody Family family) {
        familyService.createFamily(family);
    }

}
