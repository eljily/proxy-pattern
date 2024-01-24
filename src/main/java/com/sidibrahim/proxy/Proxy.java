package com.sidibrahim.proxy;

public class Proxy implements IService{

    private final IService service ;

    public Proxy(IService service) {
        this.service = service;
    }

    @Override
    public double compute(int parameter) {
        System.out.println("Before ...");
        return service.compute(parameter);
    }
}
