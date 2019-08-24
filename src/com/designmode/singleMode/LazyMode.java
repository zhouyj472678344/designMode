package com.designmode.singleMode;

/**
 * 懒汉锁单例模式，性能差，
 */
public class LazyMode {
    private static LazyMode lazyMode = null;

    private LazyMode(){}
    public static synchronized  LazyMode getInstance(){
        if (lazyMode == null){
            lazyMode= new LazyMode();
        }
        return lazyMode;
    }

}
