package com.spring.Strategy.controller;

import com.spring.Strategy.enums.EncodingPatternEnum;
import com.spring.Strategy.factory.EncryptionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    EncryptionFactory factory;

    @GetMapping("/encrypt")
    public void encryptWithEncoder(@RequestParam EncodingPatternEnum patternEnum){
        System.out.println(patternEnum);
        factory.findEncryptionType(patternEnum).encrypt("code to decode");

    }
}
