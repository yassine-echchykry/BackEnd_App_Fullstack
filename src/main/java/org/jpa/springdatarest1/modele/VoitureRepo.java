package org.jpa.springdatarest1.modele;
import org.jpa.springdatarest1.modele.Voiture;



import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;


import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RepositoryRestResource
public interface VoitureRepo extends CrudRepository<Voiture, Long> {

    // Sélectionnez les voitures par couleur
    List<Voiture> findByCouleur(@Param("couleur") String couleur);

    // Sélectionnez les voitures par année
    List<Voiture> findByModele(@Param("modele") String modele);

}
