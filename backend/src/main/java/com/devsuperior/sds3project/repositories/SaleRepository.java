package com.devsuperior.sds3project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.sds3project.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{
	
}
