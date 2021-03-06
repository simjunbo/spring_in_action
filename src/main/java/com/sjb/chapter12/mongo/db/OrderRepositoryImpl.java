package com.sjb.chapter12.mongo.db;

import com.sjb.chapter12.mongo.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;

/**
 * Created by simjunbo on 2018-07-11.
 */
public class OrderRepositoryImpl implements OrderOperations {
    @Autowired
    private MongoOperations mongo;

    @Override
    public List<Order> findOrdersByType(String t) {
        String type = t.equals("NET") ? "WEB" : t;
        Criteria where = Criteria.where("type").is(t);
        Query query = Query.query(where);

        return mongo.find(query, Order.class);
    }
}
