package com.project.factory.factoryMethods.GOF.factory;

import com.project.factory.factoryMethods.GOF.model.IPhone;
import com.project.factory.factoryMethods.GOF.model.IPhoneX;

public class IphoneXFactory extends IPhoneFactory{

    @Override
    protected IPhone createIphone() {
        return new IPhoneX();
    }
    
    
}
