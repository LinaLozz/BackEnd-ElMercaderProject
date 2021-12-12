/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Reto2_.Mercader.repository;

import com.Reto2_.Mercader.model.Gadget;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.Reto2_.Mercader.repository.crud.GadgetCrudRepository;
import java.util.Optional;

/**
 *
 * @author linal
 */
@Repository
public class GadgetRepository {
    
    @Autowired
    private GadgetCrudRepository gadgetCrudrepository;

    public List<Gadget> getAll() {
        return gadgetCrudrepository.findAll();
    }
    
    public Optional<Gadget> getGadget(int id) {
        return gadgetCrudrepository.findById(id);
    }
    
    public Gadget create(Gadget gadget) {
        return gadgetCrudrepository.save(gadget);
    }

    public void update(Gadget gadget) {
        gadgetCrudrepository.save(gadget);
    }
    
    public void delete(Gadget gadget) {
        gadgetCrudrepository.delete(gadget);
    } 
}