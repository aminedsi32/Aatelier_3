package com.jen.voitures.entities;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Voiture {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVoiture;
	private String marque;
	private Double prixVoiture;
	@ManyToOne
	private Personne personne;
	public Voiture() {
	super();
	}
	public Voiture(String marque, Double prixVoiture) {
	super();
	this.marque = marque;
	this.prixVoiture = prixVoiture;
	
	}

	public Long getIdVoiture() {
		return idVoiture;
	}
	public void setIdVoiture(Long idProduit) {
	this.idVoiture = idProduit;
	}
	public String getMarque() {
	return marque;
	}
	public void setMarque(String nomProduit) {
	this.marque = marque;
	}
	public Double getPrixVoiture() {
	return prixVoiture;
	}
	public void setPrixVoiture(Double prixProduit) {
	this.prixVoiture = prixVoiture;
	}
	
	@Override
	public String toString() {
	return "Produit [idVoiture=" + idVoiture + ", marque=" +

marque + ", prixVoiture=" + prixVoiture

	+  "]";

	}
	}

