package com.xworkz.rocket.repository;

import com.xworkz.rocket.entity.RocketEntity;


public interface RocketRepository {

	boolean save(RocketEntity entity);
	
	default RocketEntity findById(int id) {
		return null;
	}
}
