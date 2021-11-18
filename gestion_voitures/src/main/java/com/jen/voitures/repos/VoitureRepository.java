package com.jen.voitures.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.jen.voitures.entities.Personne;
import com.jen.voitures.entities.Voiture;
@RepositoryRestResource(path = "rest")
public interface VoitureRepository extends JpaRepository<Voiture, Long> {
	List<Voiture> findBymarque(String marque);
	List<Voiture> findBymarqueContains(String marque);
	List<Voiture> findByPersonneIdPers(Long id);
	List<Voiture> findByOrderByMarqueAsc();
	@Query("select v from Voiture v where v.marque like %?1 and v.prixVoiture > ?2")
	List<Voiture> findByMarquePrix (String marque, Double prix);
	
	@Query("select v from Voiture v where v.personne = ?1")
	List<Voiture> findByPersonne (Personne personne);
	
	@Query("select v from Voiture v order by v.marque ASC, v.prixVoiture DESC")
	List<Voiture> trierVoituresMarquesPrix ();
}
