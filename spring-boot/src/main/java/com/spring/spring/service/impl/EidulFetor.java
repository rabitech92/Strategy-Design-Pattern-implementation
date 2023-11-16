package com.spring.spring.service.impl;

import com.spring.spring.enums.EnumClass;
import com.spring.spring.service.OfferService;
import org.springframework.stereotype.Service;

@Service
public class EidulFetor implements OfferService {
    @Override
    public void strategy(String number) {
        System.out.println("You are Wright Way you can get Eid-Ul-Fetor");
    }

    @Override
    public EnumClass getOffer() {
        return EnumClass.EIDULFITOR;
    }
}
