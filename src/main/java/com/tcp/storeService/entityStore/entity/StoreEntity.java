package com.tcp.storeService.entityStore.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class StoreEntity {
	
	@Id
	@GeneratedValue
	private long storeID;
	
	private boolean isOpen;
	private int pinCode;
	private String address;
	private double latitude;
	private double longitude;
	private long createdAt;
	private long modifiedAt;
}
