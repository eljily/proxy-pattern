package com.sidibrahim.proxy;

public class Proxy implements IService{

    private final IService service = new ServiceImpl();
    @Override
    public double compute(int parameter) {
        System.out.println("Before ...");
        return service.compute(parameter);
    }
}
