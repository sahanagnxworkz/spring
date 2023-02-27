package com.xworkz.sahana.repository;

import com.xworkz.sahana.entity.TerroristEntity;

public interface TerroristRepository {

	boolean save(TerroristEntity entity);

	public default TerroristEntity findById(int id) {

		return null;
	}

}
