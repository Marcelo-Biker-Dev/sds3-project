package com.devsuperior.sds3project.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.sds3project.dto.SaleSuccessDTO;
import com.devsuperior.sds3project.dto.SaleSumDTO;
import com.devsuperior.sds3project.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{
	
	@Query("SELECT new com.devsuperior.sds3project.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) "
			+ "FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSumDTO> amountGroupedBySeller();
	
	@Query("SELECT new com.devsuperior.sds3project.dto.SaleSuccessDTO(obj.seller, SUM(obj.amount), SUM(obj.deals)) "
			+ "FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSuccessDTO> successGroupedBySeller();
}
