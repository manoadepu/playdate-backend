package com.playdate.configuration;

import com.mongodb.MongoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration
public class MongoOperationConfiguration {

    @Bean
    MongoOperations mongoOperations(){
        return new MongoTemplate(new MongoClient("127.0.0.1"),"playdate");
    }

}
