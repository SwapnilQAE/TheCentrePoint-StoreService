package com.tcp.storeService.daoLayer.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.tcp.storeService.daoLayer.model.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {

}
