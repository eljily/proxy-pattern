package com.sidibrahim.proxy;

public class SecurityProxy implements IService{

    private final IService service;

    public SecurityProxy(IService service) {
        this.service = service;
    }

    @Override
    public double compute(int parameter) {
        if (!SecurityContext.role.equals("ADMIN")){
            throw new RuntimeException("NOT AUTHORIZED!");
        }
        return service.compute(parameter);
    }
}
