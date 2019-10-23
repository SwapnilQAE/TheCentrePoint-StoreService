package com.tcp.storeService.controller;

import com.tcp.storeService.ErrorAndExceptions.ResourceNotFoundException;
import com.tcp.storeService.daoLayer.model.Store;
import com.tcp.storeService.daoLayer.repository.StoreRepository;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.List;

@Api(value = "Employee Management System", description = "Operations pertaining to employee in Employee Management System")
@RestController
public class StoreServiceController {

    @Autowired
    StoreRepository storeRepository;

    @ApiOperation(value = "Get an employee by Id")
    @GetMapping("/getStroe/{storeID}")
    public ResponseEntity<Store> getStoreById(@ApiParam(value = "Employee id from which employee object will retrieve", required = true)
                                              @PathVariable(value = "storeID") Long storeID)
            throws ResourceNotFoundException {
        Store store = storeRepository.findById(storeID)
                .orElseThrow(() -> new ResourceNotFoundException("Store not found for this id :: " + storeID));
        return ResponseEntity.ok().body(store);
    }

    @ApiOperation(value = "View a list of available employees", response = List.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    })
    @GetMapping("/stores")
    public List<Store> getAllStores() {
        return storeRepository.findAll();
    }

    @ApiOperation(value = "Add an employee")
    @PostMapping("/store")
    public Store createStore(@ApiParam(value = "Employee object store in database table", required = true)
                                @Valid @RequestBody Store store) {
        return storeRepository.save(store);
    }

    @ApiOperation(value = "Update an employee")
    @PutMapping("/employees/{storeID}")
    public ResponseEntity<Store> updateStore(@ApiParam(value = "Employee Id to update employee object", required = true) @PathVariable(value = "storeID") Long storeID,
                                                @ApiParam(value = "Update employee object", required = true) @Valid @RequestBody Store storeDetails) throws ResourceNotFoundException {
        Store store = storeRepository.findById(storeID)
                .orElseThrow(() -> new ResourceNotFoundException("Store not found for this id :: " + storeID));
        store.setOpen(storeDetails.isOpen());
        store.setAddress(storeDetails.getAddress());
        store.setLatitude(storeDetails.getLatitude());
        store.setLongitude(storeDetails.getLongitude());
        store.setPinCode(storeDetails.getPinCode());
        final Store updatedStore = storeRepository.save(store);
        return ResponseEntity.ok(updatedStore);
    }














    @ApiOperation(value = "API to create a new store in the system", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "/createStore", method = RequestMethod.POST)
    public void createStore1(@RequestBody Store newStore) {
    }

    @ApiOperation(value = "Api to retrieve the store details for given store ID", httpMethod = "GET", response = String.class)
    @RequestMapping(value = "/getStore", method = RequestMethod.GET)
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
