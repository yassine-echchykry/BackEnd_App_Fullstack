package org.jpa.springdatarest1;

import org.jpa.springdatarest1.modele.Proprietaire;
import org.jpa.springdatarest1.modele.ProprietaireRepo;
import org.jpa.springdatarest1.modele.Voiture;
import org.jpa.springdatarest1.modele.VoitureRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDataRest1Application {

    @Autowired
    private VoitureRepo repository;
    @Autowired
    ProprietaireRepo proprietaireRepo ;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataRest1Application.class, args);
    }

    @Bean
    public CommandLineRunner runner() {
        return args -> {
            Proprietaire proprietaire1 = new Proprietaire("Ali", "Hassan");
            Proprietaire proprietaire2 = new Proprietaire("Najat", "Bani");

            proprietaireRepo.save(proprietaire1);
            proprietaireRepo.save(proprietaire2);

            repository.save(new Voiture("Toyota", "Corolla", "Grise", "A-1-9090", 2018, 95000, proprietaire1));
            repository.save(new Voiture("Ford", "Fiesta", "Rouge", "A-2-8090", 2015, 90000, proprietaire1));
            repository.save(new Voiture("Honda", "CRV", "Bleu", "A-3-7090", 2016, 140000, proprietaire2));

        };
    }
}

