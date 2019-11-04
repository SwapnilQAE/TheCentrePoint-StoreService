package com.tcp.storeService.controller;

import com.tcp.storeService.ErrorAndExceptions.ResourceNotFoundException;
import com.tcp.storeService.serviceLayer.model.StoreDetails;
import com.tcp.storeService.serviceLayer.services.StoreService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.List;

@Api(value = "StoreDetails Services API for The Center Point Application")
@RestController
@RequestMapping("/ss/v1")
@Validated
public class StoreServiceController {

    @Autowired
    StoreService storeService;

    @ApiOperation(value = "API to create a new store in The Center Point Application", httpMethod = "POST", response = StoreDetails.class)
    @PostMapping("/store")
    public ResponseEntity<StoreDetails> createStore(@ApiParam(name = "", value = "StoreDetails object to save the details in database table", required = true)
                                                    @RequestBody @Valid StoreDetails storeDetails) {
        return storeService.createStore(storeDetails);
    }

    @ApiOperation(value = "Get the store details by providing by Id", httpMethod = "GET", response = StoreDetails.class)
    @GetMapping("/store")
    public ResponseEntity<StoreDetails> getStoreById(@ApiParam(name = "store_id", value = "Store id for which store details will be retrieved", required = true)
                                                     @Valid @RequestParam(name = "store_id", required = true)
                                                     @Min(value = 1, message = "Store Id must be greater then 1")
                                                     @Max(value = 99999, message = "Store Id must be less then 100000") long store_id)
            throws ResourceNotFoundException {
        return storeService.getStoreDetails(store_id);
    }

    @ApiOperation(value = "View a list of all available stores", httpMethod = "GET", response = List.class)
    @GetMapping("/store/getAllStore")
    public ResponseEntity<List<StoreDetails>> getAllStores() {
        return storeService.getAllStoreDetails();
    }

    @ApiOperation(value = "Update the store details", httpMethod = "PUT", response = StoreDetails.class)
    @PutMapping("/store")
    public ResponseEntity<StoreDetails> updateStore(@ApiParam(name = "store_id", value = "Store id for which store details will be retrieved", required = true)
                                                    @Valid @RequestParam(name = "store_id", required = true)
                                                    @Min(value = 1, message = "Store Id must be greater then 1")
                                                    @Max(value = 99999, message = "Store Id must be less then 100000") long store_id,
                                                    @ApiParam(value = "StoreDetails object to update the details in database table", required = true)
                                                    @Valid @RequestBody StoreDetails storeDetails) throws ResourceNotFoundException {
        return storeService.updateStoreDetails(store_id, storeDetails);
    }

    @ApiOperation(value = "Api to retrive the store details for given store ID", httpMethod = "PUT")
    @RequestMapping(value = "/updateStoreItems", method = RequestMethod.PUT)
    public void updateStoreItems(@RequestParam(name = "store_id", required = true) long storeID) {

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
