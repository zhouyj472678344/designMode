package com.designmode.factory.simple;

import com.designmode.factory.BwmCar;

public class carMain {
    public static void main(String[] args) {
        CarFarctory carFarctory = new CarFarctory();
        System.err.println(carFarctory.getCar("BWM"));
    }
}
