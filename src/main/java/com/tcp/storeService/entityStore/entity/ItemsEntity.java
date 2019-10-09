package com.tcp.storeService.entityStore.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class ItemsEntity {
	@Id
	private long itemID;
	
}
