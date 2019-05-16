package com.infotel.dao;

import java.util.List;

import javax.ejb.Remote;

import com.infotel.metier.Lotissement;
import com.infotel.metier.Personne;

@Remote
public interface IDaoRemote {

	public void ajouterPersonne(Personne p);
	public void supprimerPersonne(Long id);
	public Personne getPersonne(Long id);
	public void editerPersonne(Personne p);
	public List<Personne> listerPersonnes();

	public void ajouterLotissement(Lotissement l);
	public void supprimerLotissement(long idLot);
	public Lotissement getLotissement(Long id);
	public void editerLotissement(Lotissement l);
	public List<Lotissement> listerLotissements();
	
	public void acheterLotissement(Long idPersonne, Long idLot);
	public List<Lotissement> listerVendus();
	public List<Lotissement> listerAVendre();

}
