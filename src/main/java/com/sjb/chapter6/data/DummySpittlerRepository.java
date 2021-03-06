package com.sjb.chapter6.data;

import org.springframework.stereotype.Component;

/**
 * Created by simjunbo on 2018-06-15.
 */
@Component
public class DummySpittlerRepository implements SpitterRepository {


    @Override
    public Spitter save(Spitter spitter) {
        return null;
    }

    @Override
    public Spitter findByUsername(String username) {
        return new Spitter("name", "password", "first", "last", "email");
    }
}