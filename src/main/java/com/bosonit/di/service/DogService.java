package com.bosonit.di.service;

import com.bosonit.di.registry.AdapterService;
import org.springframework.stereotype.Service;

@Service("Dog")
public class DogService implements AdapterService {
    @Override
    public String saludar() {
        return "wuaaauuuu soy un perro";
    }
}
