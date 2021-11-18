package com.jen.voitures.service;
import java.util.List;

import com.jen.voitures.entities.*;
public interface VoitureService {
	Voiture saveVoiture(Voiture p);
	Voiture updateVoiture(Voiture p);
	void deleteVoiture(Voiture p);
	void deleteVoitureById(Long id);
	Voiture getVoiture(Long id);
	List<Voiture> getAllVoitures();
	List<Voiture> findBymarque(String marque);
	List<Voiture> findBymarqueContains(String marque);
	List<Voiture> findByMarquePrix (String marque, Double prix);
	List<Voiture> findByPersonne (Personne personne);
	List<Voiture> findByPersonneIdPers(Long id);
	List<Voiture> findByOrderByMarqueAsc();
	List<Voiture> trierVoituresMarquesPrix ();
	}

