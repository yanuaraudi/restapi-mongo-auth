package com.example.restapi_mongo_auth.service;

import com.example.restapi_mongo_auth.model.Product;
import com.example.restapi_mongo_auth.repository.ProductRepository;
import com.example.restapi_mongo_auth.repository.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


@RequiredArgsConstructor
@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public long countProducts() {
        return productRepository.count();
    }
}
