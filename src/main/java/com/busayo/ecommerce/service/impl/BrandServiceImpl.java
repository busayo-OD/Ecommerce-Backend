package com.busayo.ecommerce.service.impl;

import com.busayo.ecommerce.repository.BrandRepository;
import com.busayo.ecommerce.service.BrandService;
import org.springframework.stereotype.Service;

@Service
public class BrandServiceImpl implements BrandService {

    private BrandRepository brandRepository;

    public BrandServiceImpl(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }
}
