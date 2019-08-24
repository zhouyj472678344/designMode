package com.designmode.factory.abstr;

import com.designmode.factory.Car;
import com.designmode.factory.facto.BWMFactory;

public class Factory extends AbstrackFactory {
    @Override
    public Car getBWMCar() {
        return new BWMFactory();
    }
}
