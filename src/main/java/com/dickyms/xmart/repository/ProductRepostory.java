package com.dickyms.xmart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dickyms.xmart.model.Product;

public interface ProductRepostory extends JpaRepository<Product, Long>{
    Product findByBarcode(String barcode);
}
