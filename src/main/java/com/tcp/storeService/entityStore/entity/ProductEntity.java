package com.tcp.storeService.entityStore.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class ProductEntity {

	@Id
	@GeneratedValue
	private long productID;
	
	private String productName;
	private String type;
	private String description;
	private long createdAt;
	private long modifiedAt;
}
