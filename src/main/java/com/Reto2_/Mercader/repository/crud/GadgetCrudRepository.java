
package com.Reto2_.Mercader.repository.crud;

import com.Reto2_.Mercader.model.Gadget;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author linal
 */
public interface GadgetCrudRepository extends MongoRepository <Gadget, Integer> {
    
}