package com.tcp.storeService.entityStore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcp.storeService.entityStore.entity.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {

}
