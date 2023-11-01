package com.dickyms.xmart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dickyms.xmart.model.Product;
import com.dickyms.xmart.repository.ProductRepostory;

@Service
public class ProductService {
    @Autowired
    private ProductRepostory productRepostory;

    public List<Product> getProducts() {
        return productRepostory.findAll();
    }

    public Product getProductById(Long id) {
        return productRepostory.findById(id).orElse(null);
    }

    public Product getProductByBarcode(String barcode) {
        return productRepostory.findByBarcode(barcode);
    }

}
