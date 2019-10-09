package com.tcp.storeService.entityStore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcp.storeService.entityStore.entity.StoreEntity;

public interface StoreRepository extends JpaRepository<StoreEntity, Long> {

}
