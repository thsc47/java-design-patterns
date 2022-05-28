package com.project.factory.factoryMethods.GOF.factory;

import com.project.factory.factoryMethods.GOF.model.IPhone;
import com.project.factory.factoryMethods.GOF.model.IPhoneXSMax;

public class IphoneXSMaxFactory extends IPhoneFactory{

    @Override
    protected IPhone createIphone() {
        return new IPhoneXSMax();
    }

    
}
