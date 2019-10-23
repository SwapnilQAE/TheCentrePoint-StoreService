package com.tcp.storeService.serviceLayer.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Items {
	@Id
	private long itemID;
	
}
