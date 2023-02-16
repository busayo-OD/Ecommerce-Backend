package com.busayo.ecommerce.service.impl;

import com.busayo.ecommerce.repository.UserRepository;
import com.busayo.ecommerce.service.ProfileService;
import org.springframework.stereotype.Service;

@Service
public class ProfileServiceImpl implements ProfileService {

    private UserRepository userRepository;

    public ProfileServiceImpl(UserRepository userRepository) {

        this.userRepository = userRepository;
    }
}
