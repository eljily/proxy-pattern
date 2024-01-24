package com.sidibrahim.proxy;

import java.time.Instant;

public class LoggingProxy implements IService{

    private final IService service = new ServiceImpl();

    @Override
    public double compute(int parameter) {
        Long t1 = System.currentTimeMillis();
        double res = service.compute(parameter);
        Long t2 = System.currentTimeMillis();
        System.out.println("----Duration : "+(t2-t1));
        return res;
    }
}
