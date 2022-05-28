package com.project.factory.factoryMethods.GOF.apple.factory;

import com.project.factory.factoryMethods.GOF.apple.model.IPhone;
import com.project.factory.factoryMethods.GOF.apple.model.IPhone11Pro;

public class Iphone11Pro extends IPhoneFactory{

    @Override
    protected IPhone createIphone() {
        return new IPhone11Pro();
    }
    
}
