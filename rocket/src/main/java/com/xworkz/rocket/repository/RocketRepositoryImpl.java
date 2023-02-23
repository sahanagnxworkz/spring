package com.xworkz.rocket.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.rocket.entity.RocketEntity;

@Repository
public class RocketRepositoryImpl implements RocketRepository {
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public RocketRepositoryImpl() {
		System.out.println("running " + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(RocketEntity entity) {
		System.out.println("running save method..." );
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(entity);
		entityTransaction.commit();
		entityManager.close();
		return true;
	}
	
	@Override
	public RocketEntity findById(int id) {
		System.out.println("running ValentineEntity findById in repos impl.."+id);
	EntityManager entityManager=this.entityManagerFactory.createEntityManager();
	RocketEntity fromDb=entityManager.find(RocketEntity.class, id);
	entityManager.close();
		
		return fromDb;
	}
}
