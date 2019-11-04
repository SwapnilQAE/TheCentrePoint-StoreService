package com.tcp.storeService.serviceLayer.services;

import com.tcp.storeService.ErrorAndExceptions.ResourceNotFoundException;
import com.tcp.storeService.daoLayer.model.Store;
import com.tcp.storeService.daoLayer.repository.StoreRepository;
import com.tcp.storeService.serviceLayer.model.StoreDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StoreService {

    @Autowired
    StoreRepository storeRepository;

    public ResponseEntity<StoreDetails> createStore(StoreDetails storeDetails) {
        Store store = storeRepository.save(new Store(storeDetails.getPin_code(), storeDetails.isOpen(), storeDetails.getAddress(), storeDetails.getLatitude(), storeDetails.getLongitude()));
        return ResponseEntity.ok().body(new StoreDetails(store.getStore_id(), store.is_open(), store.getPin_code(), store.getAddress(), store.getLatitude(), store.getLongitude(), store.getCreated_at(), store.getModified_at()));
    }

    public ResponseEntity<List<StoreDetails>> getAllStoreDetails() {
        List<Store> allStores = storeRepository.findAll();
        List<StoreDetails> allStoreDetails = new ArrayList<>();
        for (Store store : allStores) {
            allStoreDetails.add(new StoreDetails(store.getStore_id(), store.is_open(), store.getPin_code(), store.getAddress(), store.getLatitude(), store.getLongitude(), store.getCreated_at(), store.getModified_at()));
        }
        return ResponseEntity.ok().body(allStoreDetails);
    }

    public ResponseEntity<StoreDetails> getStoreDetails(long store_id) throws ResourceNotFoundException {
        //TODO: first check whether the store details are available in Redis cache if yes return from there or else try to fetch the details from DB and return
        if (storeRepository.findById(store_id).isPresent()) {
            Store store = storeRepository.findById(store_id).get();
            // TODO: Save the store details in Redis cache for 15 minutes
            return ResponseEntity.ok().body(new StoreDetails(store.getStore_id(), store.is_open(), store.getPin_code(), store.getAddress(), store.getLatitude(), store.getLongitude(), store.getCreated_at(), store.getModified_at()));
        } else {
            throw new ResourceNotFoundException("The store with store id= " + store_id + " doesn't exists.");
        }
    }

    public ResponseEntity<StoreDetails> updateStoreDetails(long store_id, StoreDetails storeDetails) throws ResourceNotFoundException {
        if (storeRepository.findById(store_id).isPresent()) {
            Store store = storeRepository.save(new Store(store_id, storeDetails.getPin_code(), storeDetails.isOpen(), storeDetails.getAddress(), storeDetails.getLatitude(), storeDetails.getLongitude()));
            return ResponseEntity.ok().body(new StoreDetails(store.getStore_id(), store.is_open(), store.getPin_code(), store.getAddress(), store.getLatitude(), store.getLongitude(), store.getCreated_at(), store.getModified_at()));
        } else {
            throw new ResourceNotFoundException("The store with store id= " + store_id + " doesn't exists.");
        }
    }
}
