package com.smattme.eureka.client.wrapper;

import java.util.concurrent.TimeUnit;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        EurekaClientService eurekaClientService = new EurekaClientService();
        eurekaClientService.registerInstance();
        TimeUnit.MINUTES.sleep(1);
        eurekaClientService.deRegister();
    }
}
