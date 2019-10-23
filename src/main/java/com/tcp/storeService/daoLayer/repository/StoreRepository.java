package com.tcp.storeService.daoLayer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcp.storeService.daoLayer.model.Store;

public interface StoreRepository extends JpaRepository<Store, Long> {

}
