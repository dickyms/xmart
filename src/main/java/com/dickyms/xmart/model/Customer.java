package com.dickyms.xmart.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "customers")
@Data
public class Customer {
    @Id
    @Column(name = "customer_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "qrcode")
    private String qrcode;

    @Column(name = "name")
	private String name;
    
	private Float wallet;
}
