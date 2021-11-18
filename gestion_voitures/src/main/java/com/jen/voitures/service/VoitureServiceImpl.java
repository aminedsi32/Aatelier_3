package com.jen.voitures.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jen.voitures.entities.*;
import com.jen.voitures.repos.*;
@Service
public class VoitureServiceImpl implements VoitureService{
	@Autowired
	VoitureRepository voitureRepository;
	@Override
	public Voiture saveVoiture(Voiture v) {
	return voitureRepository.save(v);
	}
	@Override
	public Voiture updateVoiture(Voiture v) {
	return voitureRepository.save(v);
	}
	@Override
	public void deleteVoiture(Voiture v) {
	voitureRepository.delete(v);
	}
	@Override
	public void deleteVoitureById(Long id) {
	voitureRepository.deleteById(id);
	}
	@Override
	public Voiture getVoiture(Long id) {
	return voitureRepository.findById(id).get();
	}
	@Override
	public List<Voiture> getAllVoitures() {
	return voitureRepository.findAll();
	}
	
	@Override
	public List<Voiture> findBymarque(String marque) {
	return voitureRepository.findBymarque(marque);
	}
	@Override
	public List<Voiture> findBymarqueContains(String marque) {
	return voitureRepository.findBymarqueContains(marque);
	}
	@Override
	public List<Voiture> findByMarquePrix (String marque, Double prix) {
		return voitureRepository.findByMarquePrix(marque, prix);
	}
	@Override
	public List<Voiture> findByPersonne (Personne personne) {
	return voitureRepository.findByPersonne(personne);
	}
	@Override
	public List<Voiture> findByPersonneIdPers(Long id) {
	return voitureRepository.findByPersonneIdPers(id);
	}
	@Override
	public List<Voiture> findByOrderByMarqueAsc() {
	return voitureRepository.findByOrderByMarqueAsc();
	}
	@Override
	public List<Voiture> trierVoituresMarquesPrix () {
	return voitureRepository.trierVoituresMarquesPrix();
	}
	}

