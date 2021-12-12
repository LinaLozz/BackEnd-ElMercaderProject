/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Reto2_.Mercader.repository.crud;

import com.Reto2_.Mercader.model.Order;
import java.util.List;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

/**
 *
 * @author linal
 */
public interface OrderCrudRepository extends MongoRepository<Order, Integer> {
    List<Order> findBySalesManZone(String zone); 
}