package com.example.demo.config;
/*
import com.example.demo.repository.UserRepository;
import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory;
import org.springframework.data.mongodb.core.convert.DefaultDbRefResolver;
import org.springframework.data.mongodb.core.convert.DefaultMongoTypeMapper;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;
import org.springframework.data.mongodb.core.mapping.MongoMappingContext;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.concurrent.TimeUnit;

@Configuration
@EnableMongoRepositories(basePackageClasses = UserRepository.class)
public class MongoTemplateConfig {

    @Bean
    MongoMappingContext springDataMongoMappingContext() {
        return new MongoMappingContext();
    }

    @Bean
    MongoClient mongoClient() {
        ConnectionString connectionString
                = new ConnectionString("mongodb://admin:admin@localhost:27017");

        MongoClientSettings mongoClientSettings = MongoClientSettings.builder()
                .applyConnectionString(connectionString)
                .applyToConnectionPoolSettings(builder -> builder.maxSize(20)
                        .minSize(10)
                        .maxWaitTime(2000, TimeUnit.MILLISECONDS)
                        .build())
                .build();

        return MongoClients.create(mongoClientSettings);
    }

}*/


