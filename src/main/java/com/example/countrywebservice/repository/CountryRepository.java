package com.example.countrywebservice.repository;


import com.example.countrywebservice.rtdo.Country;
import com.example.countrywebservice.rtdo.Currency;
import org.springframework.stereotype.Component;



import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class CountryRepository {

    private static final Map<String, Country> countries = new HashMap<>();

    @PostConstruct
    public void initData() {
        countries.put("España",new Country("España",6,"Madrid", Currency.EUR) );
        countries.put("Francia",new Country("Francia",6,"Paris", Currency.EUR) );
        countries.put("Portugal",new Country("Portugal",6,"Lisboa", Currency.EUR) );
        countries.put("Andorra",new Country("Andorra",6,"Andorra la vieja", Currency.EUR) );
    }

    public Country findCountry(String name) {
        return countries.get(name);
    }


}