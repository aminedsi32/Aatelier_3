package com.jen.voitures.restcontrollers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jen.voitures.entities.Voiture;
import com.jen.voitures.service.VoitureService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class VoitureRESTController {
	@Autowired
	VoitureService voitureService;
	@RequestMapping(method = RequestMethod.GET)
	public List<Voiture> getAllVoitures() {
	return voitureService.getAllVoitures();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Voiture getVoitureById(@PathVariable("id") Long id) {
	return voitureService.getVoiture(id);

	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Voiture createVoiture(@RequestBody Voiture voiture) {
	return voitureService.saveVoiture(voiture);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Voiture updateVoiture(@RequestBody Voiture voiture) {
	return voitureService.updateVoiture(voiture);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteVoiture(@PathVariable("id") Long id)
	{
	voitureService.deleteVoitureById(id);
	}
	
	@RequestMapping(value="/voitspers/{idPers}",method = RequestMethod.GET)
	public List<Voiture> getVoitureByPersId(@PathVariable("idPers") Long idPers) {
	return voitureService.findByPersonneIdPers(idPers);
	}
}
