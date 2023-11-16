package com.spring.spring.service.impl;

import com.spring.spring.enums.EnumClass;
import com.spring.spring.service.OfferService;
import org.springframework.stereotype.Service;

@Service
public class PohelaBoishakh implements OfferService {
    @Override
    public void strategy(String number) {
        System.out.println("You are Wright Way you can get Pohela Boishakh Offer");
    }

    @Override
    public EnumClass getOffer() {
        return EnumClass.POHELABOISHAKH;
    }

}
