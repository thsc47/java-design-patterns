package com.project.factory.factoryMethods.GOF.factory;

import com.project.factory.factoryMethods.GOF.model.IPhone;
import com.project.factory.factoryMethods.GOF.model.IPhone11;

public class Iphone11 extends IPhoneFactory{

    @Override
    protected IPhone createIphone() {
        return new IPhone11();
    }
    
}
