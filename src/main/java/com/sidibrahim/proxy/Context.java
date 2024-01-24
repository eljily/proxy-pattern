package com.sidibrahim.proxy;

public class Context {

    private IService service;

    public void compute(int parameter){
        System.out.println("========================");
        double result = service.compute(parameter);
        System.out.println("Result => "+result);
        System.out.println("========================");
    }

    public void setService(IService service) {
        this.service = service;
    }
}
