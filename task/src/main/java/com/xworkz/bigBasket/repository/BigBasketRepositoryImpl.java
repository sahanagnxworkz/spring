package com.xworkz.bigBasket.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.bigBasket.entity.BigBasketEntity;

@Repository
public class BigBasketRepositoryImpl implements BigBasketRepository {
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public BigBasketRepositoryImpl() {
		System.out.println("running " + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(BigBasketEntity basketEntity) {
		System.out.println("running save method...");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(basketEntity);
		transaction.commit();
		entityManager.close();
		return false;
	}
}
