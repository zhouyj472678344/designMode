package com.designmode.singleMode;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 注册这单列模式
 */
public class RegisterSingMode {
    private static Map<String,Object> registerMap = new ConcurrentHashMap<String,Object>();
    private RegisterSingMode(){}

    public static RegisterSingMode getInstance(String className){
        if (className == null){
            className = RegisterSingMode.class.getName();
        }
        if(registerMap.get(className) == null)
        {
            registerMap.put(className,new RegisterSingMode());
        }
        return (RegisterSingMode) registerMap.get(className);
    }
}
