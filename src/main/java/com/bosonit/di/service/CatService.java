package com.bosonit.di.service;

import com.bosonit.di.registry.AdapterService;
import org.springframework.stereotype.Service;

@Service("Cat")
public class CatService implements AdapterService {
    @Override
    public String saludar() {
        return "miau soy un gato";
    }
}
