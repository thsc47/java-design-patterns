package com.project.factory.factoryMethods.GOF.apple.factory;

import com.project.factory.factoryMethods.GOF.apple.model.IPhone;
import com.project.factory.factoryMethods.GOF.apple.model.IPhoneX;

public class IphoneXFactory extends IPhoneFactory{

    @Override
    protected IPhone createIphone() {
        return new IPhoneX();
    }
    
    
}
