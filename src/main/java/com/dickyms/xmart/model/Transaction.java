package com.dickyms.xmart.model;

import java.util.Date;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "transactions")
@Data
public class Transaction {
    @Column(name = "transaction_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "qrcode")
    private String qrcode;

    @Column(name = "product_barcode")
    private String barcode;

    private Float price;

    private Integer quantity;

    private Date date;

    @Column(name = "mongo_id")
    private String mongoId;
}
