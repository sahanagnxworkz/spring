package com.xworkz.sahana.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.sahana.entity.TerroristEntity;

@Repository
public class TerroristRepositoryImpl implements TerroristRepository {

	@Autowired
	private EntityManagerFactory factory;

	public TerroristRepositoryImpl() {
		System.out.println("running " + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(TerroristEntity entity) {
		System.out.println("running save method");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(entity);
		transaction.commit();
		manager.close();
		return true;
	}

	@Override
	public TerroristEntity findById(int id) {
		System.out.println("running findByID method..."+id);
		EntityManager entityManager = factory.createEntityManager();
		TerroristEntity fromDb = entityManager.find(TerroristEntity.class, id);
		entityManager.close();
		return fromDb;
	}
}
