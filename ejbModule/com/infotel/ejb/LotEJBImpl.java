package com.infotel.ejb;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.infotel.dao.IDaoRemote;
import com.infotel.metier.Lotissement;
import com.infotel.metier.Personne;

@Stateless
public class LotEJBImpl implements ILotLocal, ILotRemote {

	@EJB
	private IDaoRemote dao;
	
	public IDaoRemote getDao() {
		return dao;
	}
	public void setDao(IDaoRemote dao) {
		this.dao = dao;
	}

	@Override
	public void ajouterPersonne(Personne p) {
		dao.ajouterPersonne(p);
	}
	
	@Override
	public void supprimerPersonne(Personne p) {
		dao.supprimerPersonne(p);
	}
	
	
	@Override
	public Personne getPersonne(Long id) {
		return dao.getPersonne(id);
	}

	@Override
	public void editerPersonne(Personne p) {
		dao.editerPersonne(p);
	}
	
	@Override
	public List<Personne> listerPersonnes() {
		return dao.listerPersonnes();
	}

	@Override
	public void ajouterLotissement(Lotissement l) {
		dao.ajouterLotissement(l);

	}
	@Override
	public void supprimerLotissement(Lotissement l) {
		dao.supprimerLotissement(l);	
	}
	@Override
	public void supprimerLotissement2(long idLot) {
		dao.supprimerLotissement2(idLot);	
	}

	@Override
	public Lotissement getLotissement(Long id) {
		return dao.getLotissement(id);
	}
	
	@Override
	public void editerLotissement(Lotissement l) {
		dao.editerLotissement(l);
	}
	
	@Override
	public List<Lotissement> listerLotissements() {
		return dao.listerLotissements();
	}

}
