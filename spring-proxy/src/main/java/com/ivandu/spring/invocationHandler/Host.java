package com.ivandu.spring.invocationHandler;

import com.ivandu.spring.proxy.Rent;

public class Host implements Rent, com.ivandu.spring.invocationHandler.Rent {
    @Override
    public void rent() {
        System.out.println("房东要出租房了！");
    }
}
