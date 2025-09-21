package com.sparta.myselectshop.repository;

import com.sparta.myselectshop.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
