package com.example.restapi_mongo_auth.repository;

import com.example.restapi_mongo_auth.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
