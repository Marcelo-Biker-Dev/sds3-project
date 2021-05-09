package com.devsuperior.sds3project.dto;

import java.io.Serializable;

import com.devsuperior.sds3project.entities.Seller;

public class SaleSuccessDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String sellerName;
	private double visited;
	private Long deals;

	public SaleSuccessDTO() {
	}

	public SaleSuccessDTO(Seller seller, double visited, Long deals) {
		sellerName = seller.getName();
		this.visited = visited;
		this.deals = deals;
	}



	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public double getVisited() {
		return visited;
	}

	public void setVisited(double visited) {
		this.visited = visited;
	}

	public Long getDeals() {
		return deals;
	}

	public void setDeals(Long deals) {
		this.deals = deals;
	}
	
	

}
