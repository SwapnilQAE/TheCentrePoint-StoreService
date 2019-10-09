package com.tcp.storeService.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tcp.storeService.dao.Store;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Api(value = "The Center Point")
@RestController
@Validated
public class StoreServiceController {

    @ApiOperation(value = "API to create a new store in the system", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "/createStore", method = RequestMethod.POST)
    public void createStore(@RequestBody Store newStore) {
    }

    @ApiOperation(value = "Api to retrive the store details for given store ID", httpMethod = "GET", response = String.class)
    @RequestMapping(value = "/getStroe", method = RequestMethod.GET)
    public String getStore(@ApiParam(name = "storeID", value = "Store Id to get the store details", required = true)
                           @RequestParam(name = "storeID", required = true)
                           @Min(value = 1, message = "Store Id must be greater then 1")
                           @Max(value = 99999, message = "Store Id must be less then 100000") long storeID) {
        return "your store is " + storeID;
    }

    @ApiOperation(value = "Api to retrive the store details for given store ID", httpMethod = "PUT")
    @RequestMapping(value = "/updateteStore", method = RequestMethod.PUT)
    public void updateteStore() {

    }

    @ApiOperation(value = "Api to retrive the store details for given store ID", httpMethod = "GET")
    @RequestMapping(value = "/getStoreDetails", method = RequestMethod.GET)
    public void getStoreDetails(@RequestParam(name = "storeID", required = true) long storeID) {

    }

    @ApiOperation(value = "Api to retrive the store details for given store ID", httpMethod = "PUT")
    @RequestMapping(value = "/updateStoreItems", method = RequestMethod.PUT)
    public void updateStoreItems(@RequestParam(name = "storeID", required = true) long storeID) {

    }

    @ApiOperation(value = "Api to retrive the store details for given store ID", httpMethod = "POST")
    @RequestMapping(value = "/createProduct", method = RequestMethod.POST)
    public void createProduct() {

    }

    @ApiOperation(value = "Api to retrive the store details for given store ID", httpMethod = "PUT")
    @RequestMapping(value = "/updateProduct", method = RequestMethod.PUT)
    public void updateProduct() {

    }

    @ApiOperation(value = "Api to retrive the store details for given store ID", httpMethod = "GET")
    @RequestMapping(value = "/getProduct", method = RequestMethod.GET)
    public void getProduct(@RequestParam(name = "productID", required = true) long productID) {

    }

    @ApiOperation(value = "Api to retrive the store details for given store ID", httpMethod = "GET")
    @RequestMapping(value = "/getAllProducts", method = RequestMethod.GET)
    public void getAllProducts() {

    }


}
