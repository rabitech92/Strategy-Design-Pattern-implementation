package com.spring.spring.controller;

import com.spring.spring.enums.EnumClass;
import com.spring.spring.factory.OfferFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OfferController {

    @Autowired
    OfferFactory offerFactory;

    @GetMapping("/get")
    public void getOffer(@RequestParam EnumClass enumClass){
         offerFactory.findService(enumClass).strategy("Offer Offer");
    }




}
