package com.sidibrahim.proxy;

public class LoggingProxy implements IService{

    private final IService service ;

    public LoggingProxy(IService service) {
        this.service = service;
    }

    @Override
    public double compute(int parameter) {
        Long t1 = System.currentTimeMillis();
        double res = service.compute(parameter);
        Long t2 = System.currentTimeMillis();
        System.out.println("----Duration : "+(t2-t1));
        return res;
    }
}
