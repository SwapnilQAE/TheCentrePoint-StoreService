package com.tcp.storeService.serviceLayer.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Product {

	@Id
	@GeneratedValue
	private long productID;
	
	private String productName;
	private String type;
	private String description;
	private long createdAt;
	private long modifiedAt;
}
