package com.sidibrahim;

import com.sidibrahim.proxy.*;

public class Main {
    public static void main(String[] args) {

        SecurityContext.authenticate("user1","1234","ADMIN");
        Context context = new Context();
        //context.setService(new Proxy());
        //context.setService(new SecurityProxy());
       // context.setService(new CacheProxy());
        context.setService(new LoggingProxy());
        context.compute(3);
    }
}