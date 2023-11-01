package com.dickyms.xmart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dickyms.xmart.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findByQrcode(String qrcode);
}
