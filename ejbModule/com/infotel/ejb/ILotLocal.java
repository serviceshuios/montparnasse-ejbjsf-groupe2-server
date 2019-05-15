package com.infotel.ejb;

import java.util.List;

import javax.ejb.Local;

import com.infotel.metier.Lotissement;
import com.infotel.metier.Personne;

@Local
public interface ILotLocal {
	
	public void ajouterPersonne(Personne p);
	public void supprimerPersonne(Personne p);
	public Personne getPersonne(Long id);
	public void editerPersonne(Personne p);
	public List<Personne> listerPersonnes();

	public void ajouterLotissement(Lotissement l);
	public void supprimerLotissement(Lotissement l);
	public Lotissement getLotissement(Long id);
	public void editerLotissement(Lotissement l);
	public List<Lotissement> listerLotissements();
}
