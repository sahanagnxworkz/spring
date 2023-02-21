package com.xworkz.bigBasket.repository;

import com.xworkz.bigBasket.entity.BigBasketEntity;

public interface BigBasketRepository {

	boolean save(BigBasketEntity basketEntity);
}
