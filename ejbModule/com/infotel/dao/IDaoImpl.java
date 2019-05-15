package com.infotel.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.infotel.metier.Lotissement;
import com.infotel.metier.Personne;

public class IDaoImpl implements IDaoLocal, IDaoRemote {

	@PersistenceContext(unitName="BP_UNIT")
	private EntityManager em; // lien entre BDD et dao
	
	@Override
	public void ajouterPersonne(Personne p) {
		em.persist(p);
	}

	@Override
	public void supprimerPersonne(Personne p) {
		em.remove(p);
	}
	
	@Override
	public Personne getPersonne(Long id) {
		return em.find(Personne.class, id);
	}

	@Override
	public void editerPersonne(Personne p) {
		em.persist(p);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Personne> listerPersonnes() {
		return em.createQuery("select p from Personne p").getResultList();
	}
	
	@Override
	public void ajouterLotissement(Lotissement l) {
		em.persist(l);
	}

	@Override
	public void supprimerLotissement(Lotissement l) {
		em.remove(l);	
	}

	@Override
	public Lotissement getLotissement(Long id) {
		return em.find(Lotissement.class, id);
	}

	@Override
	public void editerLotissement(Lotissement l) {
		em.persist(l);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Lotissement> listerLotissements() {
		return em.createQuery("select l from Lotissement l").getResultList();
	}


}
