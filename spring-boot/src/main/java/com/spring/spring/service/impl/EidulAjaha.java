package com.spring.spring.service.impl;

import com.spring.spring.enums.EnumClass;
import com.spring.spring.service.OfferService;
import org.springframework.stereotype.Service;

@Service
public class EidulAjaha implements OfferService {
    @Override
    public void strategy(String number) {
        System.out.println("You are Wright Way you can get Eid-Ul-Ajaha");

    }

    @Override
    public EnumClass getOffer() {
        return EnumClass.EIDULAJAHA;
    }
}
