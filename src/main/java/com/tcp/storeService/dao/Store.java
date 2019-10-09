package com.tcp.storeService.dao;

import lombok.Data;

@Data
public class Store {
	
	
	private long storeID;
	
	private boolean isOpen;
	private int pinCode;
	private String address;
	private double latitude;
	private double longitude;
	private long createdAt;
	private long modifiedAt;
}
