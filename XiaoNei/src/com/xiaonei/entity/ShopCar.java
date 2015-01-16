package com.xiaonei.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity(name = "shopcar")
public class ShopCar {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "shopcarid")
	private long shopCarId;
	
	@OneToMany(mappedBy="buyRecordId")
	private Set<BuyRecord> buyRecord;
	
	@OneToOne
	@JoinColumn(name="ownerid")
	private User ownerId;

	public long getShopCarId() {
		return shopCarId;
	}

	public void setShopCarId(long shopCarId) {
		this.shopCarId = shopCarId;
	}

	

	public Set<BuyRecord> getBuyRecord() {
		return buyRecord;
	}

	public void setBuyRecord(Set<BuyRecord> buyRecord) {
		this.buyRecord = buyRecord;
	}

	public User getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(User ownerId) {
		this.ownerId = ownerId;
	}
	

}
