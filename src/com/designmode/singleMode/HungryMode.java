package com.designmode.singleMode;

/**
 * 饿汉单例模式
 */
public class HungryMode {
    private static final HungryMode hungryMode= new HungryMode();

    private HungryMode(){}

    public static HungryMode getInstance(){
        return hungryMode;
    }
}
