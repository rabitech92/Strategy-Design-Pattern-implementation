package com.spring.spring.factory;

import com.spring.spring.enums.EnumClass;
import com.spring.spring.service.OfferService;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Component
public class OfferFactory {

    Map<EnumClass, OfferService> map;

    public OfferFactory(Set<OfferService> offerFactory) {
        createOffer(offerFactory);
    }

    private void createOffer(Set<OfferService> offerFactoryCreate) {
        map = new HashMap<EnumClass, OfferService>();
        offerFactoryCreate.stream().forEach(offer ->
                map.put(offer.getOffer(), offer));
    }

    public OfferService findService(EnumClass enumClass) {
        return map.get(enumClass);

    }
}
