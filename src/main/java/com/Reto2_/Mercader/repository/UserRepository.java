/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Reto2_.Mercader.repository;

import com.Reto2_.Mercader.model.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.Reto2_.Mercader.repository.crud.UserCrudRepository;
import java.util.Optional;

/**
 *
 * @author linal
 */
@Repository
public class UserRepository {
    
    @Autowired
    private UserCrudRepository userCrudRepository;
     
    public List<User> getAll() {
        return (List<User>) userCrudRepository.findAll();
    }
     public Optional<User> getUser(int id) {
        return userCrudRepository.findById(id);
    }

    public User create(User user) {
        return userCrudRepository.save(user);
    }
    
    public void update(User user) {
        userCrudRepository.save(user);
    }
    
    public void delete(User user) {
        userCrudRepository.delete(user);
    }

    public boolean emailExists(String email) {
        Optional<User> usuario = userCrudRepository.findByEmail(email);
        
        return !usuario.isEmpty();
    }
    
    public Optional<User> authenticateUser(String email, String password) {
        return userCrudRepository.findByEmailAndPassword(email, password);
    }
    
    public Optional<User> lastUserId(){
        return userCrudRepository.findTopByOrderByIdDesc();
    }
}