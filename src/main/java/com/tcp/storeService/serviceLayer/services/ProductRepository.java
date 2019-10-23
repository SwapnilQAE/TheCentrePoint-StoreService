package com.tcp.storeService.serviceLayer.services;



import com.tcp.storeService.serviceLayer.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {

}
