package com.busayo.ecommerce.service.impl;

import com.busayo.ecommerce.repository.UserRepository;
import com.busayo.ecommerce.service.AuthenticationService;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {

    private UserRepository userRepository;

    public AuthenticationServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
