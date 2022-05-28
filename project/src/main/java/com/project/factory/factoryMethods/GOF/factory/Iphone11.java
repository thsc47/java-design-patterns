package com.project.factory.factoryMethods.GOF.apple.factory;

import com.project.factory.factoryMethods.GOF.apple.model.IPhone;
import com.project.factory.factoryMethods.GOF.apple.model.IPhone11;

public class Iphone11 extends IPhoneFactory{

    @Override
    protected IPhone createIphone() {
        return new IPhone11();
    }
    
}
