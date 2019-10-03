package com.tcp.storeService.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StoreServiceController {
	
	@RequestMapping(value= "/createStore", method = RequestMethod.POST)
	public void createStore() {
		
	}
	
	@RequestMapping(value = "/getStroe", method = RequestMethod.GET)
	public void getStore(@RequestParam(name = "storeID", required = true) long storeID) {
		
	}
	
	
	@RequestMapping(value = "/updateteStore" , method = RequestMethod.PUT)
	public void updateteStore() {
		
	}
	
	
	@RequestMapping(value = "/getStoreDetails", method = RequestMethod.GET)
	public void getStoreDetails(@RequestParam(name = "storeID", required = true) long storeID) {
		
	}
	
	
	@RequestMapping(value = "/updateStoreItems", method = RequestMethod.PUT)
	public void updateStoreItems(@RequestParam (name = "storeID", required = true) long storeID) {
		
	}
	
	
	@RequestMapping(value = "/createProduct", method = RequestMethod.POST)
	public void createProduct() {
		
	}
	
	
	@RequestMapping(value = "/updateProduct", method = RequestMethod.PUT)
	public void updateProduct() {
		
	}
	
	
	@RequestMapping(value = "/getProduct", method = RequestMethod.GET)
	public void getProduct(@RequestParam(name = "productID", required = true)long productID) {
		
	}
	
	
	@RequestMapping(value = "/getAllProducts", method = RequestMethod.GET)
	public void getAllProducts() {
		
	}
	

}
