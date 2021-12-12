
package com.Reto2_.Mercader.repository.crud;

import com.Reto2_.Mercader.model.User;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author linal
 */
public interface UserCrudRepository extends MongoRepository<User, Integer> {
    
    Optional<User> findByEmail(String email);
    
    //List<User> findBybirthday(Date date);
    
    Optional<User> findByEmailAndPassword(String email, String password);
    
    //List<User> findByMonthBirthday(String monthBirthday);
    
    //List<User> findOneByOrderByIdDesc();
    
    //Selecciona el usuario con el Id maximo 
    Optional<User> findTopByOrderByIdDesc();
}