package com.spring.Strategy.factory;

import com.spring.Strategy.encrypt.Encryption;
import com.spring.Strategy.enums.EncodingPatternEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Component
public class EncryptionFactory {

    Map<EncodingPatternEnum, Encryption> map;

    @Autowired
    public EncryptionFactory(Set<Encryption> encryptionTypeSet) {
        createStrategy(encryptionTypeSet);
    }

    private void createStrategy(Set<Encryption> encryptionTypeSet) {
        map = new HashMap<EncodingPatternEnum,Encryption>();
        encryptionTypeSet.stream().forEach(encryptionTypes-> map.put(encryptionTypes.getEncryptionType(),encryptionTypes));
    }

    public Encryption findEncryptionType(EncodingPatternEnum patternEnum){
        return map.get(patternEnum);
    }
}
