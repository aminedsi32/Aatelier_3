package com.jen.voitures;
import java.util.Date;
import java.util.List;

import com.jen.voitures.repos.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.jen.voitures.entities.*;


@SpringBootTest
class GestionVoituresApplicationTests {
	@Autowired
	private VoitureRepository VoitureRepository;
	
	@Test
	public void testCreateVoiture() {
		Voiture v = new Voiture("FERRARI",1000.500);
		VoitureRepository.save(v);
		}
	
	@Test
	public void testFindVoiture()
	{
	Voiture v = VoitureRepository.findById(1L).get();

	System.out.println(v);
	}
	@Test
	public void testUpdateVoiture()
	{
		Voiture v = VoitureRepository.findById(1L).get();
	v.setPrixVoiture(1000.0);
	VoitureRepository.save(v);
	}
	@Test
	public void testDeleteVoiture()
	{
		VoitureRepository.deleteById(1L);;
	}
	@Test
	public void testListerTousVoitures()
	{
	List<Voiture> voits = VoitureRepository.findAll();
	for (Voiture v : voits)
	{
	System.out.println(v);
	}

	}
	
	@Test
	public void findBymarque(String marque)
	{
	List<Voiture> voits = VoitureRepository.findBymarque("FERRARI");

	for (Voiture v : voits)
	{
	System.out.println(v);
	}

	}
	@Test
	public void testFindBymarqueContains ()
	{
	List<Voiture> voits=VoitureRepository.findBymarqueContains("AUDI");

	for (Voiture v : voits)
	{
	System.out.println(v);
	} }
	
	@Test
	public void testfindByMarquePrix()
	{
	List<Voiture> voits = VoitureRepository.findByMarquePrix("BMW", 400.5);
	for (Voiture v : voits)
	{
	System.out.println(v);
	}

	}
	
	@Test
	public void testfindByPersonne()
	{
	Personne pers = new Personne();
	pers.setIdPers(1L);
	List<Voiture> voits = VoitureRepository.findByPersonne(pers);
	for (Voiture v : voits)
	{
	System.out.println(v);
	}

	}
	
	@Test
	public void findByPersonneIdPers()
	{
	List<Voiture> voits = VoitureRepository.findByPersonneIdPers(1L);
	for (Voiture v : voits)
	{
	System.out.println(v);
	}
	}
	
	@Test
	public void testfindByOrderByMarqueAsc()
	{
	List<Voiture> voits = VoitureRepository.findByOrderByMarqueAsc();
	for (Voiture v : voits)
	{
	System.out.println(v);
	}
	}
	
	@Test
	public void testTrierVoituresMarquesPrix()
	{
	List<Voiture> voits = VoitureRepository.trierVoituresMarquesPrix();
	for (Voiture v : voits)
	{
	System.out.println(v);
	}

	}

}
