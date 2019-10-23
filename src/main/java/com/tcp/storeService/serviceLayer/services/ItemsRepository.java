package com.tcp.storeService.serviceLayer.services;



import com.tcp.storeService.serviceLayer.model.Items;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ItemsRepository extends JpaRepository<Items, Long> {

}
