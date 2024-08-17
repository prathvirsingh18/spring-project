package com.springboot.study;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CurrencyController {
    @Autowired
    private CurrecyConfiguration currecyConfiguration;
    @RequestMapping("/currency-service")
    public CurrecyConfiguration currecyConfigurationValue(){
        return currecyConfiguration;
    }
}
