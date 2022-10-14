package com.bosonit.di.service;

import com.bosonit.di.registry.AdapterService;
import org.springframework.stereotype.Service;

@Service("Horse")
public class HorseService implements AdapterService {
    @Override
    public String saludar() {
        return "hiiiihihihi soy un caballo";
    }
}
