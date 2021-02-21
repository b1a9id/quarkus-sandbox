package com.b1a9idps.service.impl;

import com.b1a9idps.service.GreetingService;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String greeting(String name) {
        return "hello " + name;
    }
}
