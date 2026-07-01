package com.cognizant.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {

    private static final Logger log = LoggerFactory.getLogger(Country.class);

    private String code;
    private String name;

    public Country() {
        log.debug("Inside Country Constructor.");
    }

    public String getCode() {
        log.debug("Retrieving country code value: {}", this.code);
        return this.code;
    }

    public void setCode(String code) {
        log.debug("Setting country code value: {}", code);
        this.code = code;
    }

    public String getName() {
        log.debug("Retrieving country name value: {}", this.name);
        return this.name;
    }

    public void setName(String name) {
        log.debug("Setting country name value: {}", name);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country[code=" + code + ", name=" + name + "]";
    }
}