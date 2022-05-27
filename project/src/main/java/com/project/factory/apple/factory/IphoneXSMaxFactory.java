package com.project.factory.apple.factory;

import com.project.factory.apple.model.IPhone;
import com.project.factory.apple.model.IPhoneXSMax;

public class IphoneXSMaxFactory extends IPhoneFactory{

    @Override
    protected IPhone createIphone() {
        return new IPhoneXSMax();
    }

    
}
