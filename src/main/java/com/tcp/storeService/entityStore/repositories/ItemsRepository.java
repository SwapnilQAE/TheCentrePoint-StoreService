package com.tcp.storeService.entityStore.repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import com.tcp.storeService.entityStore.entity.ItemsEntity;


public interface ItemsRepository extends JpaRepository<ItemsEntity, Long> {

}
