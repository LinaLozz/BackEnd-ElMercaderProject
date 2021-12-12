
package com.Reto2_.Mercader.services;

import com.Reto2_.Mercader.model.Gadget;
import com.Reto2_.Mercader.repository.GadgetRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author linal
 */
@Service
public class GadgetService {
    @Autowired
    private GadgetRepository gadgetRepository;

    public List<Gadget> getAll() {
        return gadgetRepository.getAll();
    }
    
    public Optional<Gadget> getGadget(int id) {
        return gadgetRepository.getGadget(id);
    }

    public Gadget create(Gadget gadget) {
        if (gadget.getId() == null) {
            return gadget;
        } else {
            return gadgetRepository.create(gadget);
        }
    }

    public Gadget update(Gadget gadget) {

        if (gadget.getId() != null) {
            Optional<Gadget> gadgetDb = gadgetRepository.getGadget(gadget.getId());
            if (!gadgetDb.isEmpty()) {
                
                if (gadget.getBrand()!= null) {
                    gadgetDb.get().setBrand(gadget.getBrand());
                }
                
                if (gadget.getCategory() != null) {
                    gadgetDb.get().setCategory(gadget.getCategory());
                }
                
                if (gadget.getName()!= null) {
                    gadgetDb.get().setName(gadget.getName());
                }
                
                if (gadget.getDescription() != null) {
                    gadgetDb.get().setDescription(gadget.getDescription());
                }
                if (gadget.getPrice() != 0.0) {
                    gadgetDb.get().setPrice(gadget.getPrice());
                }
                if (gadget.getQuantity() != 0) {
                    gadgetDb.get().setQuantity(gadget.getQuantity());
                }
                if (gadget.getPhotography() != null) {
                    gadgetDb.get().setPhotography(gadget.getPhotography());
                }
                gadgetDb.get().setAvailability(gadget.isAvailability());
                gadgetRepository.update(gadgetDb.get());
                return gadgetDb.get();
            } else {
                return gadget;
            }
        } else {
            return gadget;
        }
    }

    public boolean delete(int id) {
        Boolean aBoolean = getGadget(id).map(gadget -> {
            gadgetRepository.delete(gadget);
            return true;
        }).orElse(false);
        return aBoolean;
    }
}