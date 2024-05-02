package com.springboot.backend.backendproducts.repositories;

import org.springframework.data.repository.CrudRepository;

import com.springboot.backend.backendproducts.entities.Product;

public interface ProductRepository extends CrudRepository<Product,Long>{

}
