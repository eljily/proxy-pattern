package com.sidibrahim.proxy;

import java.util.HashMap;
import java.util.Map;

public class CacheProxy implements IService{

    private final IService service = new ServiceImpl();

    private final Map<Integer,Double> cache = new HashMap<>();
    @Override
    public double compute(int parameter) {
        Double cacheValue = cache.get(parameter);
        if (cacheValue!=null)
        {
            System.out.println("------ Cache Result ----------");
            return cacheValue;
        }
        else {
            System.out.println("------ New Compute Result ----------");
            double res =service.compute(parameter);
            cache.put(parameter,res);
            return res;
        }
    }
}
