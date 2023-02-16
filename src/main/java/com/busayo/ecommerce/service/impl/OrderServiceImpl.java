package com.busayo.ecommerce.service.impl;

import com.busayo.ecommerce.repository.OrderRepository;
import com.busayo.ecommerce.service.OrderService;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    private OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
}
