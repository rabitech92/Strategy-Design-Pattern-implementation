package com.spring.Strategy.encrypt;

import com.spring.Strategy.enums.EncodingPatternEnum;
import org.springframework.stereotype.Service;

@Service
public class SH1Encryption implements Encryption{
    @Override
    public void encrypt(String toBeEncrypt) {
        System.out.println("I am encrypting Using SH1 method");

    }

    @Override
    public EncodingPatternEnum getEncryptionType() {
        return EncodingPatternEnum.SH1;
    }
}
