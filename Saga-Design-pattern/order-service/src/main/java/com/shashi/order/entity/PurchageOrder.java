package com.shashi.order.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "PURCHAGE_ORDER_TBL")
public class PurchageOrder {
    private Integer id;
    private Integer userId;
    private Integer productId;
}
