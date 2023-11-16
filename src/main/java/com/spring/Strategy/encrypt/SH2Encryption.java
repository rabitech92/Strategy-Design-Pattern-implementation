package com.spring.Strategy.encrypt;

import com.spring.Strategy.enums.EncodingPatternEnum;
import org.springframework.stereotype.Service;

@Service
public class SH2Encryption implements Encryption{

    @Override
    public void encrypt(String toBeEncrypt) {
        System.out.println("i am encrypting Using SH2 method");

    }

    @Override
    public EncodingPatternEnum getEncryptionType() {
        return EncodingPatternEnum.SH2;
    }
}
