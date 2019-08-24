package com.designmode.factory;

public class BwmCar implements Car {
    String userName;

    public BwmCar() {
        this.userName = "无人购买";
    }
    public BwmCar(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String getname() {
        return this.userName+"BWM";
    }
}
