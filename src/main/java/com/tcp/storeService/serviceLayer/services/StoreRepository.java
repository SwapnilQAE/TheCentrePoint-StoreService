package com.tcp.storeService.serviceLayer.services;

import com.tcp.storeService.serviceLayer.model.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<Store, Long> {

}
