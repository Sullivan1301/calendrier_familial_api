package com.example.calendrier_familiale_api.service;

import com.example.calendrier_familiale_api.model.Family;
import com.example.calendrier_familiale_api.repository.FamilyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FamilyService  {
    @Autowired
    private FamilyRepository familyRepository;

    public Family createFamily(Family family) {
        return familyRepository.save(family);
    }
}
