package com.infotel.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.infotel.metier.Lotissement;
import com.infotel.metier.Personne;

@Stateless
public class DaoImpl implements IDaoLocal, IDaoRemote {

	@PersistenceContext(unitName = "BP_UNIT")
	private EntityManager em; // lien entre BDD et dao

	@Override
	public void ajouterPersonne(Personne p) {
		em.persist(p);
	}

	@Override
	public void supprimerPersonne(Long idPersonne) {
		Query q = null;
		q = em.createQuery("DELETE FROM Personne p WHERE p.idPersonne = :id").setParameter("id", idPersonne);
		idPersonne = (long) q.executeUpdate();
	}
	
	@Override
	public Personne getPersonne(Long id) {
		return em.find(Personne.class, id);
	}
	
	@Override
	public void editerPersonne(Personne p) {
		em.merge(p);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Personne> listerPersonnes() {
		Query q = null;
		List<Personne> list = new ArrayList<Personne>();
		q = em.createQuery("SELECT p FROM Personne p");
		list = q.getResultList();
		return list;
	}

	@Override
	public void ajouterLotissement(Lotissement l) {
		em.persist(l);
	}

	@Override
	public void supprimerLotissement(long idLot) {
		Query q = null;
		q = em.createQuery("DELETE FROM Lotissement l WHERE l.idLot = :id").setParameter("id", idLot);
		idLot = q.executeUpdate();
	}

	@Override
	public Lotissement getLotissement(Long id) {
		return em.find(Lotissement.class, id);
	}

	@Override
	public void editerLotissement(Lotissement l) {
		em.merge(l);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Lotissement> listerLotissements() {
		Query q = null;
		List<Lotissement> list = new ArrayList<Lotissement>();
		q = em.createQuery("SELECT l FROM Lotissement l");
		list = q.getResultList();
		return list;
	}

	@Override
	public void acheterLotissement(Long idPersonne, Long idLot) {
		Query q = null;
		q = em.createQuery("UPDATE Lotissement lot SET lot.idPersonne = :x WHERE lot.idLot = :y")
				.setParameter("x", idPersonne)
				.setParameter("y", idLot);
		q.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Lotissement> listerAchats() {
		Query q = null;
		List<Lotissement> list = new ArrayList<Lotissement>();
		q = em.createQuery("SELECT lot FROM Lotissement lot WHERE lot.idPersonne = :x")
				.setParameter("x", null);
		list = q.getResultList();
		return list;
	}

}
