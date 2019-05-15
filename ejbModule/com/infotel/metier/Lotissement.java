package com.infotel.metier;

import java.util.Date;

import javax.persistence.ManyToOne;

public class Lotissement {
	
	private long idLot;
	private int numLot;
	private String adresseLot; 
	private Date dateCreation; 
	private double prix; 
	
	@ManyToOne
	private Personne personne;

	public long getIdLot() {
		return idLot;
	}

	public void setIdLot(long idLot) {
		this.idLot = idLot;
	}

	public int getNumLot() {
		return numLot;
	}

	public void setNumLot(int numLot) {
		this.numLot = numLot;
	}

	public String getAdresseLot() {
		return adresseLot;
	}

	public void setAdresseLot(String adresseLot) {
		this.adresseLot = adresseLot;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public Personne getPersonne() {
		return personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

	@Override
	public String toString() {
		return "Lotissement [idLot=" + idLot + ", numLot=" + numLot + ", adresseLot=" + adresseLot + ", dateCreation="
				+ dateCreation + ", prix=" + prix + ", personne=" + personne + "]";
	}

	public Lotissement(long idLot, int numLot, String adresseLot, Date dateCreation, double prix, Personne personne) {
		super();
		this.idLot = idLot;
		this.numLot = numLot;
		this.adresseLot = adresseLot;
		this.dateCreation = dateCreation;
		this.prix = prix;
		this.personne = personne;
	}

	public Lotissement() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
