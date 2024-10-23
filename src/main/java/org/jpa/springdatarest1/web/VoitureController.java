package org.jpa.springdatarest1.web;

import org.jpa.springdatarest1.modele.Voiture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.jpa.springdatarest1.modele.*;

@RestController
@CrossOrigin(origins="http://localhost:3000")
@RequestMapping("/voitures")
public class VoitureController {

    @Autowired
    private VoitureRepo voitureRepo;

    @GetMapping
    public Iterable<Voiture> getAllVoitures() {
        return voitureRepo.findAll();
    }
}

