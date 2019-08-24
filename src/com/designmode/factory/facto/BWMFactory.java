package com.designmode.factory.facto;

import com.designmode.factory.Car;

public class BWMFactory implements Car {
    @Override
    public String getname() {
        return "BWM";
    }
}
