package com.xiaonei.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity(name = "buyrecord")
public class BuyRecord {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "buyrecordid")
	private long buyRecordId;
	
    @OneToMany(mappedBy="productId")
	private Set<Product> product;
    
	@ManyToOne
	@JoinColumn(name="ownerid")
	private User ownerId;
	
	@Column(name = "buystatus", nullable=false)
	private int buyStatus = 0;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "buytime", nullable=false)
	private Date buyTime = new Date();
	
	@ManyToOne
	@JoinColumn(name = "shopcarid")
	private ShopCar shopCar;

	public long getBuyRecordId() {
		return buyRecordId;
	}

	public void setBuyRecordId(long buyRecordId) {
		this.buyRecordId = buyRecordId;
	}

	

	public Set<Product> getProduct() {
		return product;
	}

	public void setProduct(Set<Product> product) {
		this.product = product;
	}

	public User getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(User ownerId) {
		this.ownerId = ownerId;
	}

	public int getBuyStatus() {
		return buyStatus;
	}

	public void setBuyStatus(int buyStatus) {
		this.buyStatus = buyStatus;
	}

	public Date getBuyTime() {
		return buyTime;
	}

	public void setBuyTime(Date buyTime) {
		this.buyTime = buyTime;
	}

	public ShopCar getShopCar() {
		return shopCar;
	}

	public void setShopCar(ShopCar shopCar) {
		this.shopCar = shopCar;
	}
	
	
	

}
