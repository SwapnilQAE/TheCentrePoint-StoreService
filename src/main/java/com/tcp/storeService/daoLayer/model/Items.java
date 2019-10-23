package com.tcp.storeService.daoLayer.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Items {
	@Id
	private long itemID;
	
}
