package com.busayo.ecommerce.service.impl;

import com.busayo.ecommerce.repository.ProductRepository;
import com.busayo.ecommerce.service.ProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
}
