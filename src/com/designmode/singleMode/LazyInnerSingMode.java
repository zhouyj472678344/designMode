package com.designmode.singleMode;

/**
 * 懒汉加载内部类单列，解决锁性能问题
 */
public class LazyInnerSingMode {
    private  LazyInnerSingMode(){}
    public static final LazyInnerSingMode getInstance(){
        return lazyHold.lazyHold;
    }

    public static class lazyHold{
        private static final LazyInnerSingMode lazyHold= new LazyInnerSingMode();
    }

}
