package com.sidibrahim.proxy;

public class SecurityProxy implements IService{

    private final IService service = new ServiceImpl();

    @Override
    public double compute(int parameter) {
        if (!SecurityContext.role.equals("ADMIN")){
            throw new RuntimeException("NOT AUTHORIZED!");
        }
        return service.compute(parameter);
    }
}
