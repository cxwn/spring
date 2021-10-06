package com.ivandu.spring.proxy;

public class Proxy {
    private Host host;

    public Proxy(){}

    public Proxy(Host host) {
        this.host = host;
    }

    public void rent() {
        seeHouse();
        host.rent();
        contract();
        charge();
    }

    public void seeHouse(){
        System.out.println("中介带你看房");
    }

    public void contract(){
        System.out.println("签订租赁合同！");
    }

    public void charge() {
        System.out.println("收取中介费！");
    }
}
