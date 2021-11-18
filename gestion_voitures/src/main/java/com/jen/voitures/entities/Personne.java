package com.jen.voitures.entities;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Personne {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPers;
	private String nom;
	private String prenom;
	
	
	@OneToMany(mappedBy = "personne")
	@JsonIgnore
	private List<Voiture> voitures;
	public Personne(String nom, String prenom, List<Voiture> voitures)
	{

	super();
	this.nom = nom;
	this.prenom = prenom;
	this.voitures = voitures;
	}
	public Long getIdCat() {
	return idPers;
	}
	public void setIdPers(Long idPers) {
	this.idPers = idPers;
	}
	public String getNom() {
	return nom;
	}
	public void setNom(String nom) {
	this.nom = nom;
	}
	public String getprenom() {
	return prenom;
	}
	public void setprenom(String prenom) {
	this.prenom = prenom;
	}
	public List<Voiture> getProduits() {
	return voitures;
	}
	public void setProduits(List<Voiture> voitures) {
	this.voitures = voitures;
	}
	}

