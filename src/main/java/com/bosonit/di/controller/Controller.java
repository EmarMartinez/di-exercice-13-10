package com.bosonit.di.controller;


import com.bosonit.di.registry.ServiceRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    ServiceRegistry serviceRegistry;

    @GetMapping("{animal}")
    public String helloVehicle(@PathVariable String animal) {
        return serviceRegistry.getService(animal).saludar();
    }
}
