package com.example.restapi_mongo_auth.repository;


import com.example.restapi_mongo_auth.model.Product;

import java.util.List;

public interface ProductService {
    Product addProduct(Product product);
    List<Product> getAllProducts();
    long countProducts();
}
