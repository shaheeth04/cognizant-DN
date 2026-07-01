package com.cognizant.springlearn.service;

import com.cognizant.springlearn.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CountryService {

    private List<Country> loadAllCountries() {
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        List<Country> countries = new ArrayList<>();

        countries.add(context.getBean("country", Country.class));
        countries.add(context.getBean("us", Country.class));
        countries.add(context.getBean("de", Country.class));
        countries.add(context.getBean("jp", Country.class));

        return countries;
    }

    public Country getCountry(String code) {
        if (code == null) {
            return null;
        }
        return loadAllCountries().stream()
                .filter(c -> code.equalsIgnoreCase(c.getCode()))
                .findFirst()
                .orElse(null);
    }
}