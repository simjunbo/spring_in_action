package com.sjb.chapter12.mongo.db;

import com.sjb.chapter12.mongo.model.Order;

import java.util.List;

/**
 * Created by simjunbo on 2018-07-11.
 */
public interface OrderOperations {
    List<Order> findOrdersByType(String t);
}
