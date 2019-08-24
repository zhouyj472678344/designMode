package com.designmode.factory.abstr;

import com.designmode.factory.Car;
import com.designmode.factory.facto.BWMFactory;

public abstract class AbstrackFactory {

    public String lineWiter(){
        return getBWMCar().getname();
    }
    public abstract Car getBWMCar();

}
