package com.xiaonei.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity(name = "product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "productid")
	private long productId;
	
	@Column(name = "username", nullable=false)
	private String productName;
	
	@ManyToOne
	@JoinColumn(name="ownerid")
	private User owner;
	
	@Column(name = "price", nullable=false)
	private BigDecimal price;
	
	@Column(name = "keywords", nullable=false)
	private String keywords;
	
	@Column(name = "description", nullable=false)
	private String description;
	
	@Column(name = "imgUrls", nullable=false)
	private String imgUrls;
	
	@Column(name = "visitnum", nullable=false)
	private long visitNum = 0;
	
	@Column(name = "likenum", nullable=false)
	private long likeNum = 0;
	
	@Column(name = "buynum", nullable=false)
	private long buyNum = 0;
	
	@Column(name = "marknum", nullable=false)
	private long markNum = 0;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "createdate", nullable=false)
	private Date createDate;
	

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public User getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImgUrls() {
		return imgUrls;
	}

	public void setImgUrls(String imgUrls) {
		this.imgUrls = imgUrls;
	}

	public long getVisitNum() {
		return visitNum;
	}

	public void setVisitNum(long visitNum) {
		this.visitNum = visitNum;
	}

	public long getLikeNum() {
		return likeNum;
	}

	public void setLikeNum(long likeNum) {
		this.likeNum = likeNum;
	}

	public long getBuyNum() {
		return buyNum;
	}

	public void setBuyNum(long buyNum) {
		this.buyNum = buyNum;
	}

	public long getMarkNum() {
		return markNum;
	}

	public void setMarkNum(long markNum) {
		this.markNum = markNum;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	

}
