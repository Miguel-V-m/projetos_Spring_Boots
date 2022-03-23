package edu.mjv.school.projetofinal.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
public class GenericRepository {
	@PersistenceContext
	private EntityManager em;
	@Transactional
	public void save(Object object) {
		em.persist(object);
	}
	
}
