package com.spring.Strategy.encrypt;

import com.spring.Strategy.enums.EncodingPatternEnum;
import org.springframework.stereotype.Service;

@Service
public class MD5Encryption implements Encryption{

    @Override
    public void encrypt(String toBeEncrypt) {
        System.out.println("i am encrypting Using MD5 method");

    }

    @Override
    public EncodingPatternEnum getEncryptionType() {
        return EncodingPatternEnum.MD5;
    }
}
