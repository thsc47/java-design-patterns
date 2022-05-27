package com.project.gofFactory.apple.factory;

import com.project.gofFactory.apple.model.IPhone;
import com.project.gofFactory.apple.model.IPhoneXSMax;

public class IphoneXSMaxFactory extends IPhoneFactory{

    @Override
    protected IPhone createIphone() {
        return new IPhoneXSMax();
    }

    
}
