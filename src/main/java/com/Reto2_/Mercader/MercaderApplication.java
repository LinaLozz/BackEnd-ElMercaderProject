package com.Reto2_.Mercader;

import com.Reto2_.Mercader.repository.crud.GadgetCrudRepository;
import com.Reto2_.Mercader.repository.crud.OrderCrudRepository;
import com.Reto2_.Mercader.repository.crud.UserCrudRepository;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MercaderApplication implements CommandLineRunner{
    
    @Autowired
    private GadgetCrudRepository gadgetCrudRepository;
    @Autowired
    private UserCrudRepository userCrudRepository;
    @Autowired
    private OrderCrudRepository orderCrudRepository;
    
    public static void main(String[] args) {
        SpringApplication.run(MercaderApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        gadgetCrudRepository.deleteAll();
        userCrudRepository.deleteAll();
        orderCrudRepository.deleteAll();
    }
}