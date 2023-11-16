package com.spring.Strategy.encrypt;

import com.spring.Strategy.enums.EncodingPatternEnum;

public interface Encryption {

    public void encrypt(String toBeEncrypt);
    public EncodingPatternEnum getEncryptionType();
}
