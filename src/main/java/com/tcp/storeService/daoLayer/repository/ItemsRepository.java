package com.tcp.storeService.daoLayer.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.tcp.storeService.daoLayer.model.Items;


public interface ItemsRepository extends JpaRepository<Items, Long> {

}
