package com.xiaonei.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "productcatalog")
public class ProductCatalog {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "catalogid")
	private long catalogId;
	
	@Column
	private String description;
	
	@ManyToOne
	@JoinColumn(name = "parentid")
	private ProductCatalog parentId;

	public long getCatalogId() {
		return catalogId;
	}

	public void setCatalogId(long catalogId) {
		this.catalogId = catalogId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ProductCatalog getParentId() {
		return parentId;
	}

	public void setParentId(ProductCatalog parentId) {
		this.parentId = parentId;
	}
	
	
}
