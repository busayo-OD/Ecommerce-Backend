package com.busayo.ecommerce.service.impl;

import com.busayo.ecommerce.repository.CouponRepository;
import com.busayo.ecommerce.service.CouponService;
import org.springframework.stereotype.Service;

@Service
public class CouponServiceImpl implements CouponService {

    private CouponRepository couponRepository;

    public CouponServiceImpl(CouponRepository couponRepository) {
        this.couponRepository = couponRepository;
    }
}
